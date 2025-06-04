package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScorecardStepdefs {

    private TrackerDriver tracker;

    public ScorecardStepdefs(TrackerDriver tracker) {
        this.tracker = tracker;
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
