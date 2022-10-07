package de.itagile.golf;

import de.itagile.golf.operation.Beenden;
import de.itagile.golf.operation.Hilfe;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Lochwechsel;
import de.itagile.golf.operation.Lochwechselausgabe;
import de.itagile.golf.operation.Schlag;
import de.itagile.golf.operation.Schlagzahlausgabe;
import de.itagile.golf.operation.UndoLetzterSchlag;
import de.itagile.golf.operation.UndoLochwechsel;
import de.itagile.golf.operation.ZwischenErgebnisAusgabe;

public enum Befehle {
  SCHLAG(new Schlag(new Schlagzahlausgabe(new Lochausgabe())),
      "dann erhöhe ich um einen Schlag. Alias: s", "Schlage Ball"),
  SCHLAG_ALIAS(SCHLAG.getOperation(), "", "s"),
  BEENDEN(new Beenden(), "Das Programm wird beendet. Alias: b", "Beenden"),
  BEENDEN_ALIAS(BEENDEN.getOperation(), "", "b"),
  HILFE(new Hilfe(), "dann zeige ich Dir das hier. Alias: h", "Hilfe"),
  HILFE_ALIAS(HILFE.getOperation(), "", "h"),

  LOCHWECHSEL(new Lochwechsel(new Lochwechselausgabe(new Lochausgabe())),
      "dann gehe ich ein Loch weiter. Alias: n", "Nächstes Loch"),
  LOCHWECHSEL_ALIAS(LOCHWECHSEL.getOperation(), "", "n"),

  UNDO_SCHLAG(new UndoLetzterSchlag(new Schlagzahlausgabe(new Lochausgabe())),
      "dann mache ich den letzten Schlag rückgängig, sofern möglich. Alias: us",
      "Undo Letzter Schlag"),
  UNDO_SCHLAG_ALIAS(UNDO_SCHLAG.getOperation(), "", "us"),

  UNDO_LOCHWECHSEL(new UndoLochwechsel(new Schlagzahlausgabe(new Lochausgabe())),
      "dann mache ich den letzten Lochwechsel rückgängig, sofern möglich. Alias: ul",
      "Undo Lochwechsel"),
  UNDO_LOCHWECHSEL_ALIAS(UNDO_LOCHWECHSEL.getOperation(), "", "ul"),
  SCORE(new ZwischenErgebnisAusgabe(), "dann wird das Zwischenergebnis angezeigt. Alias: z",
      "Zwischenergebnis"),
  SCORE_ALIAS(SCORE.getOperation(), "", "z"),
  DEFAULT(SCHLAG.getOperation(), SCHLAG.getHilfeText(), "");

  private Operation operation;
  private String hilfeText;
  private String kommando;

  Befehle(Operation opertation, String hilfeText, String kommando) {
    this.operation = opertation;
    this.hilfeText = hilfeText;
    this.kommando = kommando;
  }

  public Operation getOperation() {
    return operation;
  }

  public String getHilfeText() {
    return hilfeText;
  }

  public String getKommando() {
    return kommando;
  }

}
