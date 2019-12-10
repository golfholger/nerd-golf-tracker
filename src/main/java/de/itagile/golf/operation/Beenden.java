package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchliessenException;

public class Beenden implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException {
		throw new AnwendungSchliessenException("Anwendung wurde beendet");
	}

}
