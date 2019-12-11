package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public final class Lochwechsel implements Operation {
	@Override
	public String fuehreAus(Scorecard scorecard) {
		scorecard.schliesseLochAb();
		return null;
	}
}