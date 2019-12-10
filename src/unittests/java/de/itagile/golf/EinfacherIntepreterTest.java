package de.itagile.golf;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.itagile.golf.operation.Hilfe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.UnbekannteOperation;
import de.itagile.golf.operation.Zwischenergebnisausgabe;

@RunWith(Parameterized.class)
public class EinfacherIntepreterTest {

	private Interpreter interpreter = new EinfacherInterpreter();
	private final String befehl;
	private final Class<? super Operation> operation;

	public EinfacherIntepreterTest(String befehl, Class<? super Operation> operation) {
		this.befehl = befehl;
		this.operation = operation;
	}
	
	@Parameters
	public static List<Object[]> parameters() {
		Object[][] testData = new Object[][] {
				{"Schlage Ball", Schlag.class},
				{"Nächstes Loch", Lochwechsel.class},
				{"Zwischenergebnis ausgeben", Zwischenergebnisausgabe.class},
				{"Hilfe", Hilfe.class},
				};
		return Arrays.asList(testData);
	}
	
	@Test
	public void interpretiertBefehle() throws Exception {
		assertThat(interpreter.interpretiere(befehl), isA(operation));
	}
	
	@Test
	public void hilfeBefehlTest() throws Exception {
		assertThat(interpreter.interpretiere("Hilfe"), instanceOf(Hilfe.class));
	}
	
	@Test
	public void unbekannterBefehlTest() throws Exception {
		assertThat(interpreter.interpretiere("Hlife"), instanceOf(UnbekannteOperation.class));
	}
}
