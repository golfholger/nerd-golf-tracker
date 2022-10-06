package de.itagile.golf;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

import static org.hamcrest.Matchers.containsString;

public class ZwischenergebnisStepdefs {

    private final TrackerDriver tracker;

    public ZwischenergebnisStepdefs(TrackerDriver tracker) {
        this.tracker = tracker;
    }


    @Wenn("der Benutzer den Befehl {string} eingibt")
    public void derBenutzerDenBefehlEingibt(String kommando) {
        tracker.gibEin(kommando);
    }

    @Dann("wird die Summe aller Schläge angezeigt")
    public void wirdDieSummeAllerSchlägeAngezeigt() {
        tracker.assertThatAntwort(containsString("Zwischenergebnis: "));
    }
}
