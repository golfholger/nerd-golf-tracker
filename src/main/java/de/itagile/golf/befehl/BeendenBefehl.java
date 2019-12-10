package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.BefehleSammler;
import de.itagile.golf.operation.Beenden;
import de.itagile.golf.operation.Hilfe;

public class BeendenBefehl implements Befehl {

	public String kommando() {
		return "Beenden";
	}

	public Operation operation() {
		return new Beenden();
	}

	public String beschreibung() {
		return "dann beende ich das Programm";
	}

}
