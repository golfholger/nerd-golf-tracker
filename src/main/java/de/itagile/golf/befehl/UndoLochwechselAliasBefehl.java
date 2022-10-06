package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Schlagzahlausgabe;
import de.itagile.golf.operation.UndoLochwechsel;

public class UndoLochwechselAliasBefehl extends UndoLochwechselBefehl {


	public String kommando() {
		return "ul";
	}

	@Override
	public boolean showInHelp() {
		return false;
	}

}
