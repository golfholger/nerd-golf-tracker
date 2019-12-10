package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchliessenException;

public class Lochwechselausgabe implements Operation {

	private final Operation folgeoperation;

	public Lochwechselausgabe(Operation folgeoperation) {
		this.folgeoperation = folgeoperation;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException {
		return "Deine Schlagzahl wurde zurückgesetzt und Du bist " + folgeoperation.fuehreAus(scorecard);
	}
}
