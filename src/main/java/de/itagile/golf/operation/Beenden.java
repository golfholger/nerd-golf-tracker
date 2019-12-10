package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchließenException;

public class Beenden implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchließenException {
		throw new AnwendungSchließenException("Anwendung wurde beendet");
	}

}
