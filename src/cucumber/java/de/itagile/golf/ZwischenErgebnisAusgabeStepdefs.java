package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZwischenErgebnisAusgabeStepdefs {
	
	private TrackerDriver tracker;
	
	public ZwischenErgebnisAusgabeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}	
	
	@When("ich den Befehl Zwischenergebnis anzeigen eingebe")
	public void GebeBefehlEin() {	
		tracker.gibEin("Zwischenergebnis");
	}
	
	@Then("wird die Gesamtanzahl (\\d+) Schläge für alle Löcher angezeigt")
	public void FuehreZwischenergebnisAnzeigenAus(int schlaege) {
		tracker.assertThatAntwort(containsString(String.format("%d", schlaege)));
	}
}