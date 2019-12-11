package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchliessenException;

public class Schlagzahlausgabe implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException {
		String vorlage = this.getVorlage(scorecard);
		return String.format(vorlage, scorecard.anzahlSchlaegeAktuellesLoch());
	}

	private String getVorlage(Scorecard scorecard) {
		if (scorecard.anzahlSchlaegeAktuellesLoch() != 1) {
			return "Du hast %d Schläge";
		}
		return "Du hast %d Schlag";
	}
}
