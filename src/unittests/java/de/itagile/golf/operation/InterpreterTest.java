package de.itagile.golf.operation;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import de.itagile.golf.EinfacherInterpreter;
import de.itagile.golf.Interpreter;

public class InterpreterTest {
	
	private Interpreter interpreter = new EinfacherInterpreter();

	@Test
	public void hilfeBefehlTest() throws Exception {
		assertThat(interpreter.interpretiere("Hilfe"), instanceOf(Hilfe.class));
	}
	
	@Test
	public void unbekannterBefehlTest() throws Exception {
		assertThat(interpreter.interpretiere("Hlife"), instanceOf(UnbekannteOperation.class));
	}

	
}
