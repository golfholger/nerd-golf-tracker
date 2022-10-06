package de.itagile.golf.befehl;

public class UndoLetzterSchlagAliasBefehl extends UndoLetzterSchlagBefehl {

	@Override
	public String kommando() {
		return "us";
	}

	@Override
	public boolean showInHelp() {
		return false;
	}
}
