package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Zwischenergebnisausgabe implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		return createAusgabe(scorecard);
	}

	private String createAusgabe(Scorecard scorecard) {
		String vorlage =  "Du hast %d %s.";
		int schlaege = scorecard.anzahlSchlaegeGesamt();
		String ausgabe = String.format(vorlage, 
				 schlaege, (schlaege == 1 ? "Schlag" : "Schläge"));
		return ausgabe;
	}

}
