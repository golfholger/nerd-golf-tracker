package de.itagile.golf.befehl;

public class HilfeAliasBefehl extends HilfeBefehl {

	@Override
	public String kommando() {
		return "h";
	}

	@Override
	public boolean showInHelp() {
		return false;
	}
}
