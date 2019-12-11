package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.FolgeOperation;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Lochwechselausgabe;

public class LochwechselBefehl implements Befehl {

	@Override
	public Operation operation() {
		return new FolgeOperation(new Lochwechsel(), new Lochwechselausgabe(), new Lochausgabe());
	}

	@Override
	public String kommando() {
		return "Nächstes Loch";
	}

	@Override
	public String beschreibung() {
		return "dann zähle ich für das nächste Loch mit";
	}

}
