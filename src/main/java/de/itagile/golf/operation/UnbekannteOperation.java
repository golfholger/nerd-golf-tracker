package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchließenException;
import de.itagile.golf.util.SystemProperties;

public class UnbekannteOperation implements Operation {

	private Operation operation;
	
	public UnbekannteOperation(Operation operation) {
		this.operation = operation;
	}
	
	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchließenException {
		return "Unbekannte Eingabe!" + SystemProperties.LINE_SEPARATOR + operation.fuehreAus(scorecard);
	}

}
