package de.itagile.golf;

import java.util.HashMap;
import java.util.Map;

import de.itagile.golf.operation.Hilfe;
import de.itagile.golf.operation.UnbekannteOperation;

public class EinfacherInterpreter implements Interpreter {

	private Map<String, Operation> operationen = new HashMap<>();

	public EinfacherInterpreter() {
		new BefehleSammler().sammle().forEach(befehl -> operationen.put(befehl.kommando(), befehl.operation()));
	}

	@Override
	public Operation interpretiere(String string) {
		if (operationen.containsKey(string)) {
			return operationen.get(string);
		}
		return new UnbekannteOperation(new Hilfe(new BefehleSammler()));
	}
}
