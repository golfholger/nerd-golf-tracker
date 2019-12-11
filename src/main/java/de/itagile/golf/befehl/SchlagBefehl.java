package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.FolgeOperation;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Schlagzahlausgabe;

public class SchlagBefehl implements Befehl {

	@Override
	public Operation operation() {
		return new FolgeOperation(new Schlag(),new Schlagzahlausgabe(),new Lochausgabe());
	}

	@Override
	public String kommando() {
		return "Schlage Ball";
	}

	@Override
	public String beschreibung() {
		return "dann zähle ich mit";
	}

}
