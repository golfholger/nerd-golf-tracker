package de.itagile.golf;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import de.itagile.golf.util.SystemProperties;

public class ZwischenErgebnisAusgabeStepdefs {
	
	@When("ich den Befehl Zwischenergebnis anzeigen eingebe")
	public String fuehreAus(Scorecard scorecard) {	
		//tracker.gibEin("Hilfe");
		return "";
	}
	
	@Then("wird die Gesamtanzahl Schläge für alle Löcher angezeigt")
	public void ersteZeile() {
		//String[] zeilen = tracker.letzteAntwort().split(SystemProperties.LINE_SEPARATOR);
		//assertThat(zeilen[0], equalTo("Ich reagiere auf: "));
	}
}