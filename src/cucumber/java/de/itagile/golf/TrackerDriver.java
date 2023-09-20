package de.itagile.golf;

import de.itagile.golf.util.SystemProperties;
import org.hamcrest.Matcher;

import java.io.*;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TrackerDriver {

	private Process process;
	private BufferedReader reader;
	private PrintWriter writer;
	private String letzteAntwort;

    public void starte() {
        process = starteProzess();
        reader = readerFor(process);
        writer = writerFor(process);
        speichereAntwort();
    }

    public void beende() {
        process.destroy();
    }

    private PrintWriter writerFor(Process process) {
		return new PrintWriter(new OutputStreamWriter(process.getOutputStream()), true);
	}

	private BufferedReader readerFor(Process process) {
		return new BufferedReader(new InputStreamReader(process.getInputStream()));
	}

	private Process starteProzess() {
		try {
			String command = String.format(
					"java -Dfile.encoding=%s -jar %s",
					SystemProperties.FILE_ENCODING,
					"build/libs/nerd-golf-tracker.jar");
			return Runtime.getRuntime().exec(
					command);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void gibEin(String anweisung) {
		writer.println(anweisung);
		speichereAntwort();
	}

	public String letzteAntwort() {
		return letzteAntwort;
	}

	private void speichereAntwort() {
		try {
			letzteAntwort = readOutputFrom(reader);
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	private String readOutputFrom(BufferedReader reader) throws IOException {
		StringBuilder collector = new StringBuilder();
		collector.append(reader.readLine());
		collector.append(SystemProperties.LINE_SEPARATOR);
		while (reader.ready()) {
			collector.append(reader.readLine());
			collector.append(SystemProperties.LINE_SEPARATOR);
		}
		return collector.toString();
	}

	public void assertThatAntwort(Matcher<String> matcher) {
		assertThat(letzteAntwort(), matcher);
	}

	public boolean isRunning() {
		return this.process.isAlive();
	}

	public void assertThatRunning(boolean isRunning) {
		await().atMost(2, SECONDS).untilAsserted(() ->
			assertThat(isRunning(), is(isRunning))
		);
	}
}
