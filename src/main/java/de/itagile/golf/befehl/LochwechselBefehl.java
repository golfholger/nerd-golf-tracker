package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.CompositeOperation;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Lochwechselausgabe;

public class LochwechselBefehl implements Befehl {

	public Lochwechsel operation() {
		CompositeOperation compositeOperation = new CompositeOperation(new Lochausgabe());
		return new Lochwechsel(new Lochwechselausgabe(compositeOperation));
	}

	public String kommando() {
		return "Nächstes Loch";
	}

	public String beschreibung() {
		return "dann zähle ich für das nächste Loch mit";
	}

}
