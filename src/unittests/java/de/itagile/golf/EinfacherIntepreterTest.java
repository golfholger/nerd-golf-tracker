package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.itagile.golf.operation.Hilfe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Schlag;

public class EinfacherIntepreterTest {

	private Interpreter interpreter = new EinfacherInterpreter();

	private static Stream<Arguments> befehlParameter() {
	    return Stream.of(
				Arguments.of("Schlage Ball", Schlag.class),
				Arguments.of("Nächstes Loch", Lochwechsel.class),
				Arguments.of("Hilfe", Hilfe.class),
				Arguments.of("schlage ball", Schlag.class),
				Arguments.of("nächstes loch", Lochwechsel.class),
				Arguments.of("hilfe", Hilfe.class)
	    );
	}

	@ParameterizedTest
	@MethodSource("befehlParameter")
	public void interpretiertBefehle(String befehl, Class<Operation> operation) throws Exception {
		assertThat(interpreter.interpretiere(befehl), instanceOf(operation));
	}

	@Test
	void interpretiertUnbekanntenBefehl() {
		assertThat(interpreter.interpretiere("Unbekannt"), instanceOf(Hilfe.class));
	}
}
