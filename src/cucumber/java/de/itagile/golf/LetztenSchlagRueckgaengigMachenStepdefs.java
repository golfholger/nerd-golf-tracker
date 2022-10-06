package de.itagile.golf;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;
import org.junit.Assert;

import static org.hamcrest.Matchers.containsString;

public class LetztenSchlagRueckgaengigMachenStepdefs {

    private final TrackerDriver tracker;

    public LetztenSchlagRueckgaengigMachenStepdefs(TrackerDriver tracker) {
        this.tracker = tracker;
    }

    @Wenn("Eingabe {string} und anschließend {string} erfolgt")
    public void eingabeUndAnschließendErfolgt(String eingabe1, String eingabe2) {
        tracker.gibEin(eingabe1);
        tracker.gibEin(eingabe2);
    }

    @Dann("erwarte, dass der letzte Schlag rückgängig gemacht wird und die Schlagzahl {int} angezeigt wird")
    public void erwarteDassDerLetzteSchlagRückgängigGemachtWirdUndDieSchlagzahlAngezeigtWird(int erwarteteSchlagzahl) {
        pruefeSchlagAnzeige(erwarteteSchlagzahl);
    }

    private void pruefeSchlagAnzeige(int erwarteteSchlagzahl) {
        //assert
        tracker.assertThatAntwort(containsString(erwarteteSchlagzahl + ". Schlag"));
    }

    @Wenn("Eingabe {string} erfolgt und ich aktuell noch keinen Schlag gemacht habe")
    public void eingabeErfolgtUndIchAktuellNochKeinenSchlagGemachtHabe(String eingabe1) {
        tracker.gibEin(eingabe1);
    }

    @Dann("erwarte, dass kein Schlag rückgängig gemacht wird und sich die Schlagzahl nicht vermindert \\({int} nicht unterschreitet)")
    public void erwarteDassKeinSchlagRückgängigGemachtWirdUndSichDieSchlagzahlNichtVermindertNichtUnterschreitet(int erwarteteSchlagzahl) {
        pruefeSchlagAnzeige(erwarteteSchlagzahl);
    }
}
