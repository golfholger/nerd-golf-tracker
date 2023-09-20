package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class KleinBuchstabenBefehlStepdefs {
    private TrackerDriver tracker;

    public KleinBuchstabenBefehlStepdefs(TrackerDriver tracker) {
        this.tracker = tracker;
    }

    @When("ich einen hilfe klein eingebe")
    public void rufeHilfeAuf() {
        tracker.gibEin("hilfe");
    }
    @Then("wird der Hilfe Befehl ausgeführt")
    public void pruefeHilfeEintrag() {
        tracker.assertThatAntwort(containsString("Ich reagiere auf:"));
    }
}
