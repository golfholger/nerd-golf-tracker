package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Beenden implements Operation {

	public Beenden() {
	}

	@Override
	public String fuehreAus(Scorecard scorecard) {
		return "Vielen Dank für die Nutzung von GolfTracker";
	}
}
