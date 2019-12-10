package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Zwischenergebnisausgabe implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		int schlaege = scorecard.gesamtanzahlSchlaege();
		return "" + schlaege + (schlaege == 1 ? " Schlag" : " Schläge");
	}

}
