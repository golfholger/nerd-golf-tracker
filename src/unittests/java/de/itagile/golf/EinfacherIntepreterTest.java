package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;

import de.itagile.golf.operation.Hilfe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Schlag;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

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
		Object[][] testData = new Object[][]{
				{"Schlage Ball", Schlag.class},
				{"Nächstes Loch", Lochwechsel.class},
				{"Hilfe", Hilfe.class},
				{"schlage ball", Schlag.class},
				{"Schlage ball", Schlag.class},
				{"schlage Ball", Schlag.class},
				{"", Schlag.class},
				{"nächstes loch", Lochwechsel.class},
				{"nächstes Loch", Lochwechsel.class},
				{"Nächstes loch", Lochwechsel.class},
				{"hilfe", Hilfe.class},
		};
		return Arrays.asList(testData);
	}
	
	@Test
	public void interpretiertBefehle() throws Exception {
		assertThat(interpreter.interpretiere(befehl), isA(operation));
	}

}
