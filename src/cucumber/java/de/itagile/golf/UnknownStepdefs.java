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
	public void i_put_in_an_unknown_command() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@Then("I see the Help")
	public void i_see_the_help() {
		// Write code here that turns the phrase above into concrete actions
	}
}
