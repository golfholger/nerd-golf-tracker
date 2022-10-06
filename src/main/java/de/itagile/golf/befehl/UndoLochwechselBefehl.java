package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Schlagzahlausgabe;
import de.itagile.golf.operation.UndoLetzterSchlag;
import de.itagile.golf.operation.UndoLochwechsel;

public class UndoLochwechselBefehl implements Befehl {

	public UndoLochwechsel operation() {
		return new UndoLochwechsel(new Schlagzahlausgabe(new Lochausgabe()));
	}

	public String kommando() {
		return "Undo Lochwechsel";
	}

	public String beschreibung() {
		return "dann mache ich den letzten Lochwechsel rückgängig, sofern möglich. Alias: ul";
	}

}
