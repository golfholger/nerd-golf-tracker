package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Lochwechselausgabe implements Operation {
	@Override
	public String fuehreAus(Scorecard scorecard) {
		return "Deine Schlagzahl wurde zurückgesetzt und Du bist";
	}
}
