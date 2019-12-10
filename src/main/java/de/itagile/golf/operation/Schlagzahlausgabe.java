package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchließenException;

public class Schlagzahlausgabe implements Operation {

	private Operation folgeoperation;

	public Schlagzahlausgabe(Operation folgeoperation) {
		this.folgeoperation = folgeoperation;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchließenException {
		String vorlage = this.getVorlage(scorecard);
		return String.format(vorlage, 
							 scorecard.anzahlSchlaegeAktuellesLoch(), 
							 folgeoperation.fuehreAus(scorecard));
	}
	
	private String getVorlage(Scorecard scorecard) {
		if(scorecard.anzahlSchlaegeAktuellesLoch() != 1) 
		{
			return "Du hast %d Schläge %s";
		}	
		
		return "Du hast %d Schlag %s";
	}
}
