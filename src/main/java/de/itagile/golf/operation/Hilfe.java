package de.itagile.golf.operation;

import de.itagile.golf.Befehle;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.util.SystemProperties;
import java.util.ArrayList;
import java.util.List;

public class Hilfe implements Operation {

	@Override
	public String fuehreAus(Scorecard scorecard) {
		List<String> hilfeTexte = new ArrayList<>();

		for (Befehle befehl : Befehle.values()) {
			if (!befehl.getHilfeText().isEmpty()) {
				hilfeTexte.add(hilfeZeileFuer(befehl));
			}
		}
		final String collected = String.join(SystemProperties.LINE_SEPARATOR, hilfeTexte);

		return "Ich reagiere auf:" + SystemProperties.LINE_SEPARATOR + collected;
	}

	private String hilfeZeileFuer(Befehle befehl) {
		return String.format(" * %s (...%s)", befehl.getKommando(), befehl.getHilfeText());
	}
}
