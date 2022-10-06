# language: de
Funktionalität: Undo ermöglichen

  Szenario: Letzten Schlag rückgängig machen
    Wenn Eingabe "Schlage Ball" und anschließend "Undo Letzter Schlag" erfolgt
    Dann erwarte, dass der letzte Schlag rückgängig gemacht wird und die Schlagzahl 0 angezeigt wird

  Szenario: Letzten Schlag rückgängig machen und dabei negative Werte verhindern
    Wenn Eingabe "Undo Letzter Schlag" erfolgt und ich aktuell noch keinen Schlag gemacht habe
    Dann erwarte, dass kein Schlag rückgängig gemacht wird und sich die Schlagzahl nicht vermindert (0 nicht unterschreitet)

  @in_arbeit
  Szenario: Letzten Lochwechsel rückgängig machen
    Wenn Eingabe "Nächstes Loch" und anschließend "Undo Lochwechsel" erfolgt
    Dann erwarte, dass der Lochwechsel rückgängig gemacht wird und Loch 1 angezeigt wird

  @in_arbeit
  Szenario: Letzten Lochwechsel rückgängig machen und dabei Werte kleiner 1 verhindern
    Wenn Eingabe "Undo Lochwechsel" erfolgt und ich aktuell noch bei Loch 1 bin
    Dann erwarte, dass kein Lochwechsel rückgängig gemacht wird und weiterhin Loch 1 angezeigt wird