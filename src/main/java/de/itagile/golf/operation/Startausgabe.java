package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Startausgabe implements Operation {
	@Override
	public String fuehreAus(Scorecard scorecard) {
		return "Du bist";
	}
}
