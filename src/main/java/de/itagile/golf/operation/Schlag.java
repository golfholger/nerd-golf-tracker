package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchliessenException;

public final class Schlag implements Operation {
	
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException {
		scorecard.erhoeheAnzahlSchlaege();
		return null;
	}

}