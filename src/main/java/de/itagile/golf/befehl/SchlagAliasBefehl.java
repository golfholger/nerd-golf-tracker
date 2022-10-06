package de.itagile.golf.befehl;

public class SchlagAliasBefehl extends SchlagBefehl {

	@Override
	public String kommando() {
		return "s";
	}

	@Override
	public boolean showInHelp() {
		return false;
	}
}
