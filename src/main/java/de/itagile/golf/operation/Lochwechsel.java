package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchliessenException;

public final class Lochwechsel implements Operation {
	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException {
		scorecard.schliesseLochAb();
		return null;
	}
}