package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public final class UndoLochwechsel implements Operation {

	private final Operation folgeoperation;

	public UndoLochwechsel(Operation folgeoperation) {
		this.folgeoperation = folgeoperation;
	}
	
	public String fuehreAus(Scorecard scorecard) {

		scorecard.geheLochZurück();
		return folgeoperation.fuehreAus(scorecard);
	}

}