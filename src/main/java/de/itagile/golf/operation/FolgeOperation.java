package de.itagile.golf.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.fehler.AnwendungSchliessenException;
import de.itagile.golf.util.CollectionUtils;

public class FolgeOperation implements Operation {

	private final List<Operation> folgeOperationen;

	public FolgeOperation(Operation... operations) {
		folgeOperationen = Arrays.asList(operations);
	}

	public Operation getFirstOperation() {
		if (folgeOperationen.size() > 0) {
			return folgeOperationen.get(0);
		}
		return null;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException {
		List<String> rueckgabeWerte = new ArrayList<>();
		for (Operation operation : folgeOperationen) {
			String ausgabe = operation.fuehreAus(scorecard);
			if (ausgabe != null) {
				rueckgabeWerte.add(ausgabe);
			}
		}
		return CollectionUtils.join(rueckgabeWerte, " ");
	}

}
