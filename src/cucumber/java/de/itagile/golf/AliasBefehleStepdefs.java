package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

public class AliasBefehleStepdefs {

  private TrackerDriver tracker;

  public AliasBefehleStepdefs(TrackerDriver tracker) {
    this.tracker = tracker;
  }

  @Wenn("Alias {string} eingegeben wird")
  public void aliasEingegebenWird(String alias) {
    tracker.gibEin(alias);
  }

  @Dann("wird Befehl {string} ausgefuehrt")
  public void wirdBefehlAusgefuehrt(String kommando) {
    tracker.assertThatAntwort(containsString(kommando));
  }
}
