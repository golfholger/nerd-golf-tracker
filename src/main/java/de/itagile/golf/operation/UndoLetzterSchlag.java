package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public final class UndoLetzterSchlag implements Operation {

	private final Operation folgeoperation;

	public UndoLetzterSchlag(Operation folgeoperation) {
		this.folgeoperation = folgeoperation;
	}
	
	public String fuehreAus(Scorecard scorecard) {
		scorecard.reduziereAnzahlSchlaege();
		return folgeoperation.fuehreAus(scorecard);
	}

}