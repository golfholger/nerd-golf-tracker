package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Schlagzahlausgabe;
import de.itagile.golf.operation.UndoLetzterSchlag;

public class UndoLetzterSchlagBefehl implements Befehl {

	public UndoLetzterSchlag operation() {
		return new UndoLetzterSchlag(new Schlagzahlausgabe(new Lochausgabe()));
	}

	public String kommando() {
		return "Undo Letzter Schlag";
	}

	public String beschreibung() {
		return "dann mache ich den letzten Schlag rückgängig, sofern möglich";
	}

}
