package de.itagile.golf;

import de.itagile.golf.operation.Hilfe;
import de.itagile.golf.operation.HinweisAusgabe;
import java.util.HashMap;
import java.util.Map;


public class EinfacherInterpreter implements Interpreter {

	private Map<String, Operation> operationen = new HashMap<>();

	public EinfacherInterpreter() {
		new BefehleSammler().sammle().forEach(befehl -> operationen.put(befehl.kommando().toLowerCase(), befehl.operation()));
	}

	@Override
	public Operation interpretiere(String string) {
		Operation operation = operationen.get(string.toLowerCase().trim());
		if(operation == null){
			return new HinweisAusgabe(new Hilfe(new BefehleSammler()));
		}
		return operation;
	}
}
