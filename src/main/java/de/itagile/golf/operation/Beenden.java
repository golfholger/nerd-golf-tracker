package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Beenden implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard)  {
		scorecard.programmBeendenAusfuehren();
		return("Anwendung wurde beendet");
	}
}