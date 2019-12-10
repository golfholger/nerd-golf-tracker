package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchliessenException;

public final class Schlag implements Operation {
	
	private final Operation folgeoperation;

	public Schlag(Operation folgeoperation) {
		this.folgeoperation = folgeoperation;
	}
	
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException {
		scorecard.erhoeheAnzahlSchlaege();
		return folgeoperation.fuehreAus(scorecard);
	}

}