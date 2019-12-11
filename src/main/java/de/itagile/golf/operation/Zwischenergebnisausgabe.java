package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Zwischenergebnisausgabe implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		return createAusgabe(scorecard);
	}

	private String createAusgabe(Scorecard scorecard) {
		int schlaege = scorecard.anzahlSchlaegeGesamt();
		return "Du hast insgesamt " + schlaege + (schlaege == 1 ? " Schlag" : " Schläge") + ".";
	}

}
