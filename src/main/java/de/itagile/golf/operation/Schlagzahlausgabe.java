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
		return AusgabeUtil.getHitsStringFor(scorecard.anzahlSchlaegeAktuellesLoch()) + " " + folgeoperation.fuehreAus(scorecard);
	}
}
