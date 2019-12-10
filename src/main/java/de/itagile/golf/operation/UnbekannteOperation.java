package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchliessenException;
import de.itagile.golf.util.SystemProperties;

public class UnbekannteOperation implements Operation {

	private Operation operation;
	
	public UnbekannteOperation(Operation operation) {
		this.operation = operation;
	}
	
	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException {
		return "Unbekannte Eingabe!" + SystemProperties.LINE_SEPARATOR + operation.fuehreAus(scorecard);
	}

}
