package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Schlagzahlausgabe implements Operation {

	private Operation folgeoperation;

	public Schlagzahlausgabe(Operation folgeoperation) {
		this.folgeoperation = folgeoperation;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) {
		String vorlage = this.getVorlage(scorecard);
		return String.format(vorlage, 
							 scorecard.anzahlSchlaege(), 
							 folgeoperation.fuehreAus(scorecard));
	}
	
	private String getVorlage(Scorecard scorecard) {
		if(scorecard.anzahlSchlaege() != 1) 
		{
			return "Du hast %d Schläge %s";
		}	
		
		return "Du hast %d Schlag %s";
	}
}
