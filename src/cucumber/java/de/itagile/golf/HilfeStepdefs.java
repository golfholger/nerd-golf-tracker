package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

public class HilfeStepdefs {
	
	private TrackerDriver tracker;

	public HilfeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}

	@Wenn("ich die Hilfe aufrufe mit {string}")
	public void rufeHilfeAuf(String kommando) {
		tracker.gibEin(kommando);
	}

	@Dann("listet der NerdGolfTracker einen Eintrag zu {string} auf")
	public void pruefeHilfeEintrag(String kommando) {
		tracker.assertThatAntwort(containsString(kommando));
	}

	@Dann("listet der NerdGolfTracker einen Eintrag zu {string} mit dem {string} auf")
	public void listetDerNerdGolfTrackerEinenEintragZuMitDemAuf(String kommando, String alias) {
		tracker.assertThatAntwort(containsString(kommando));
		tracker.assertThatAntwort(containsString("Alias: " + alias));

	}
}
