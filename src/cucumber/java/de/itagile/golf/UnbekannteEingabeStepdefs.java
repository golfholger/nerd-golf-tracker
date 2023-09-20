package de.itagile.golf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.Matchers.startsWith;

public class UnbekannteEingabeStepdefs {

	private TrackerDriver tracker;

	public UnbekannteEingabeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich eine unbekannte Eingabe mache")
    public void macheUnbekannteEingabe() {
        tracker.gibEin("Unbekannt");
    }
	
	@Then("bekomme ich einen Hinweis auf die Hilfe")
	public void pruefeAusgabe() {
		tracker.assertThatAntwort(startsWith("Ich reagiere auf:"));
	}
}
