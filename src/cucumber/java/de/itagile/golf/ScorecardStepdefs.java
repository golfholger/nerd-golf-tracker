package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScorecardStepdefs {

    private TrackerDriver tracker;

    public ScorecardStepdefs(TrackerDriver tracker) {
        this.tracker = tracker;
    }

    @Given("Initially I am on the {int}. hole")
    public void initially_i_am_on_the_hole(Integer int1) {
        for(int i = 1; i < int1; i++) {
            tracker.input("Next hole");
        }
    }


    @When("I use the Scorecard")
    public void callScorecard() {
        tracker.input("Scorecard");
    }

    @Then("I see the Scorecard with last Entry hole: {int} and hit: {int}")
    public void lastEntryOfScorecard(Integer expectedHole, Integer expectedHits) {
        // Write code here that turns the phrase above into concrete actions
        tracker.assertThatAnswer(containsString(String.format("Hole %d: %d", expectedHole, expectedHits)));
    }
}
