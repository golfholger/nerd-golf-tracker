package de.itagile.golf;

import java.util.HashMap;
import java.util.Map;


public class EinfacherInterpreter implements Interpreter {

	private Map<String, Operation> operationen = new HashMap<>();

	public EinfacherInterpreter() {
		new BefehleSammler().sammle().forEach(befehl -> operationen.put(befehl.kommando().toLowerCase(), befehl.operation()));
	}

	@Override
	public Operation interpretiere(String string) {
		return operationen.get(string.toLowerCase());
	}
}
