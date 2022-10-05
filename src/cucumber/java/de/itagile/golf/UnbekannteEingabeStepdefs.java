package de.itagile.golf;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

import static org.hamcrest.Matchers.containsString;

public class UnbekannteEingabeStepdefs {


    private TrackerDriver tracker;

    public UnbekannteEingabeStepdefs(TrackerDriver tracker) {
        this.tracker = tracker;
    }

    @Wenn("unbekannte Eingabe {string} erfolgt")
    public void gebeUnbekannteEingabeEin(String eingabe) {
        tracker.gibEin(eingabe);
    }

    @Dann("teile dies dem Benutzer mit und zeige die Hilfe an")
    public void zeigeHinweisUndHilfeAn() {
        tracker.assertThatAntwort(containsString("Hinweis"));
        tracker.assertThatAntwort(containsString("Hilfe"));
    }

}
