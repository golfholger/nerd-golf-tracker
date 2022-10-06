package de.itagile.golf;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

import static org.hamcrest.Matchers.containsString;

public class UndoStepdefs {

    private final TrackerDriver tracker;

    public UndoStepdefs(TrackerDriver tracker) {
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

    @Wenn("Eingabe {string} erfolgt und ich aktuell noch keinen Schlag gemacht habe")
    public void eingabeErfolgtUndIchAktuellNochKeinenSchlagGemachtHabe(String eingabe1) {
        tracker.gibEin(eingabe1);
    }

    @Dann("erwarte, dass kein Schlag rückgängig gemacht wird und sich die Schlagzahl nicht vermindert \\({int} nicht unterschreitet)")
    public void erwarteDassKeinSchlagRückgängigGemachtWirdUndSichDieSchlagzahlNichtVermindertNichtUnterschreitet(int erwarteteSchlagzahl) {
        pruefeSchlagAnzeige(erwarteteSchlagzahl);
    }

    @Dann("erwarte, dass der Lochwechsel rückgängig gemacht wird und Loch {int} angezeigt wird")
    public void erwarteDassDerLochwechselRückgängigGemachtWirdUndLochAngezeigtWird(int loch) {
        pruefeLochAnzeige(loch);
    }

    @Wenn("Eingabe {string} erfolgt und ich aktuell noch bei Loch {int} bin")
    public void eingabeErfolgtUndIchAktuellNochBeiLochBin(String eingabe, int loch) {
        tracker.gibEin(eingabe);
    }

    @Dann("erwarte, dass kein Lochwechsel rückgängig gemacht wird und weiterhin Loch {int} angezeigt wird")
    public void erwarteDassKeinLochwechselRückgängigGemachtWirdUndWeiterhinLochAngezeigtWird(int loch) {
        pruefeLochAnzeige(loch);
    }

    private void pruefeSchlagAnzeige(int erwarteteSchlagzahl) {
        //assert
        tracker.assertThatAntwort(containsString(erwarteteSchlagzahl + ". Schlag"));
    }

    private void pruefeLochAnzeige(int loch) {
        tracker.assertThatAntwort(containsString(loch + ". Loch"));
    }
}
