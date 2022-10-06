package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Lochwechselausgabe;

public class LochwechselBefehl implements Befehl {

	public Lochwechsel operation() {
		return new Lochwechsel(new Lochwechselausgabe(new Lochausgabe()));
	}

	public String kommando() {
		return "Nächstes Loch";
	}

	public String beschreibung() {
		return "dann gehe ich ein Loch weiter. Alias: n";
	}

}
