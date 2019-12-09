package de.itagile.golf;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HilfeStepdefs {
	
	private TrackerDriver tracker;

	public HilfeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich die Hilfe aufrufe")
	public void rufeHilfeAuf() {
		tracker.gibEin("Hilfe");
	}
	
	@And("\"(.*)\" steht in der ersten Zeile mit Zeilenumbruch")
	public void ersteZeile(String zeile) {
		String[] zeilen = tracker.letzteAntwort().split("\n");
		assertThat(zeilen[0], equalTo(zeile));
	}
	
	@Then("listet der NerdGolfTracker einen Eintrag zu (.*) auf")
	public void pruefeHilfeEintrag(String kommando) {
		tracker.assertThatAntwort(containsString(kommando));
	}
}
