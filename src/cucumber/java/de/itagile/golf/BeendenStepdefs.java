package de.itagile.golf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.awaitility.Awaitility;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BeendenStepdefs {

    private final TrackerDriver tracker;

    public BeendenStepdefs(TrackerDriver tracker) {this.tracker = tracker;}

    @When("ich den NerdGolfTracker beende")
    public void beendeDasProgramm() {
        tracker.gibEin("Beenden");
    }

    @Then("sehen wir uns am 19. Loch")
    public void pruefeBeendenMessage() {
        tracker.assertThatAntwort(containsString("Wir sehen uns am 19. Loch!"));
    }

    @Then("ist die Applikation beendet")
    public void pruefeBeendetesProgramm() {
        Awaitility.await().untilAsserted(() ->
            assertFalse(tracker.isRunning())
        );
    }
}
