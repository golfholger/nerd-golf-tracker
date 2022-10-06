package de.itagile.golf.befehl;

public class BeendenAliasBefehl extends BeendenBefehl {

	@Override
	public String kommando() {
		return "b";
	}

	@Override
	public boolean showInHelp() {
		return false;
	}
}
