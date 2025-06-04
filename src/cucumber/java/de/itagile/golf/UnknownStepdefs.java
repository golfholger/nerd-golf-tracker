package de.itagile.golf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.hamcrest.Matchers.containsString;

public class UnknownStepdefs {

	private TrackerDriver tracker;

	public UnknownStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}

	@When("I put in an unknown command")
	public void callUnknown() {
		tracker.input("Unknown");
	}
	@Then("I see the Help")
	public void checkHelpOutput() {
		tracker.assertThatAnswer(containsString("I respond to:"));
	}
}
