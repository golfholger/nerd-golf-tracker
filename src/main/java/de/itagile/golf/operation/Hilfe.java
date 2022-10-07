package de.itagile.golf.operation;

import de.itagile.golf.Befehl;
import de.itagile.golf.BefehleSammler;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.util.SystemProperties;

import java.util.ArrayList;
import java.util.List;

public class Hilfe implements Operation {

	private final BefehleSammler sammler;

	public Hilfe(BefehleSammler sammler) {
		this.sammler = sammler;
	}

	@Override
	public String fuehreAus(Scorecard scorecard) {
		List<String> hilfeTexte = new ArrayList<>();
		for (Befehl befehl : sammler.sammle()) {
			if (befehl.showInHelp()) {
				hilfeTexte.add(hilfeZeileFuer(befehl));
			}
		}
		final String collected = String.join(SystemProperties.LINE_SEPARATOR, hilfeTexte);

		return "Ich reagiere auf:"+SystemProperties.LINE_SEPARATOR + collected;
	}

	private String hilfeZeileFuer(Befehl befehl) {
		return String.format(" * %s (...%s)", befehl.kommando(), befehl.beschreibung());
	}
}
