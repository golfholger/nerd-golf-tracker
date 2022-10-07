package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;
import org.junit.Assert;

public class StartStopStepdefs {

    private final TrackerDriver tracker;

    public StartStopStepdefs(TrackerDriver tracker) {
        this.tracker = tracker;
    }

    @Wenn("ich {string} eingebe")
    public void rufeBeendenAuf(String kommando) {
        tracker.gibEin(kommando);
    }

    @Dann("wird ausgegeben: 'Vielen Dank für die Nutzung des Nerd-GolfTrackers.' und die Applikation wird beendet")
    public void pruefeBeendenEintrag() throws InterruptedException {
        tracker.assertThatAntwort(containsString("Vielen Dank für die Nutzung des Nerd-GolfTrackers."));
        Process process = tracker.getProcess();

        Thread.sleep(5000);
        Assert.assertEquals(0, process.exitValue());
        tracker.starte();
    }
}
