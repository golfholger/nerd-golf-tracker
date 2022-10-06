package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

public class AktuellesLochStepdefs {

  private TrackerDriver tracker;

  public AktuellesLochStepdefs(TrackerDriver tracker) {
    this.tracker = tracker;
  }

  @Wenn("ich zum nächsten Loch gehe")
  public void geheZumNaechstenLoch() {
    tracker.gibEin("Nächstes Loch");
  }

  @Dann("bin ich auf dem {int}. Loch")
  public void pruefeAktuellesLoch(int erwartetesLoch) {
    pruefeLochAnzeige(erwartetesLoch);
    tracker.gibEin("Schlage Ball");
    pruefeLochAnzeige(erwartetesLoch);
  }

  private void pruefeLochAnzeige(int loch) {
    tracker.assertThatAntwort(containsString(String.format("%d. Loch", loch)));
  }

  @Wenn("ich auf dem Loch {int} bin")
  public void ichAufDemLochBin(int loch) {
    for (int i = 1; i < loch; i++) {
      tracker.gibEin("Nächstes Loch");
    }
  }

  @Dann("wird mir das Par {int} angezeigt")
  public void wirdMirDasParAngezeigt(int par) {
    tracker.assertThatAntwort(containsString(String.format("(Par %d)", par)));
  }
}
