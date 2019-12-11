package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchliessenException;

public class Startausgabe implements Operation {
	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException {
		return "Du bist";
	}
}
