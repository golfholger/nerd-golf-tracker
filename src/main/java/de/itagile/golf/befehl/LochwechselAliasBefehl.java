package de.itagile.golf.befehl;

public class LochwechselAliasBefehl extends LochwechselBefehl {

	@Override
	public String kommando() {
		return "n";
	}

	@Override
	public boolean showInHelp() {
		return false;
	}
}
