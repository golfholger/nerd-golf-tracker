package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BeendenStepdefs {
	
	private TrackerDriver tracker;

	public BeendenStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich den Befehl Beenden eingebe")
	public void beenden() {
		tracker.gibEin("Beenden");
	}
	
	@Then("wird der Status angezeigt")
	public void ersteZeile() {
		tracker.assertThatAntwort(containsString("Anwendung wurde beendet"));
	}
}
