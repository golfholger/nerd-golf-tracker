package de.itagile.golf;

import static java.lang.String.valueOf;
import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UnbekannteEingabeStepdefs {

	private TrackerDriver tracker;

	public UnbekannteEingabeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}

	@When("ich eine unbekannte Eingabe mache wie (.*)")
	public void unbekannteEingabe(String eingabe) {
		tracker.gibEin(eingabe);
	}

	@Then("bekomme ich einen Hinweis auf die Hilfe")
	public void pruefeSchlaegeAnNeuemLoch() {
		tracker.assertThatAntwort(containsString("Unbekannte Eingabe!"));
	}
}
