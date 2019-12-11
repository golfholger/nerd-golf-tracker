package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchliessenException;

public class Schlagzahlausgabe implements Operation {

	private Operation folgeoperation;

	public Schlagzahlausgabe(Operation folgeoperation) {
		this.folgeoperation = folgeoperation;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException {
		return createAusgabe(scorecard);
	}

	private String createAusgabe(Scorecard scorecard) throws AnwendungSchliessenException {
		String vorlage =  "Du hast %d %s %s";
		String ausgabe = String.format(vorlage, 
				 scorecard.anzahlSchlaegeAktuellesLoch(), (scorecard.anzahlSchlaegeAktuellesLoch() == 1 ? "Schlag" : "Schläge"), folgeoperation.fuehreAus(scorecard));
		return ausgabe;
	}
}
