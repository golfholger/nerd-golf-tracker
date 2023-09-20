package de.itagile.golf;

import de.itagile.golf.befehl.LochwechselBefehl;
import de.itagile.golf.befehl.SchlagBefehl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.stream.IntStream;

import static de.itagile.golf.util.SystemProperties.LINE_SEPARATOR;
import static java.util.stream.Collectors.joining;
import static org.hamcrest.Matchers.containsString;

public class ScorecardAnzeigenStepdefs {

    private final TrackerDriver tracker;

    private List<Integer> schlaegeProLoch;

    public ScorecardAnzeigenStepdefs(TrackerDriver tracker) {
        this.tracker = tracker;
    }

    @Given("folgende Schläge")
    public void folgendeSchlaege(List<Integer> schlaegeProLoch) {
        this.schlaegeProLoch = schlaegeProLoch;
        schlaegeProLoch.forEach(this::spieleLoch);
    }

    @When("ich die Scorecard aufrufe")
    public void zeigeScorecard() {
        tracker.gibEin("Scorecard");
    }

    @Then("zeigt der Tracker die Schläge für jedes Loch an")
    public void pruefeScorecard() {
        tracker.assertThatAntwort(containsString(scorecardAusgabe()));
    }

    private String scorecardAusgabe() {
        return IntStream.range(0, schlaegeProLoch.size())
                .mapToObj(i -> "Loch %d: %d".formatted(i, schlaegeProLoch.get(i)))
                .collect(joining(LINE_SEPARATOR));
    }

    private void spieleLoch(Integer schlaege) {
        for (int i = 0; i < schlaege; i++) {
            tracker.gibEin(new SchlagBefehl().kommando());
        }
        tracker.gibEin(new LochwechselBefehl().kommando());
    }
}
