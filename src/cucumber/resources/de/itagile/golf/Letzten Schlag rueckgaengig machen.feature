# language: de
Funktionalität: Undo ermöglichen

  Szenario: Letzten Schlag rückgängig machen
    Wenn Eingabe "Schlage Ball" und anschließend "Undo Letzter Schlag" erfolgt
    Dann erwarte, dass der letzte Schlag rückgängig gemacht wird und die Schlagzahl 0 angezeigt wird

  Szenario: Letzten Schlag rückgängig machen und dabei negative Werte verhindern
    Wenn Eingabe "Undo Letzter Schlag" erfolgt und ich aktuell noch keinen Schlag gemacht habe
    Dann erwarte, dass kein Schlag rückgängig gemacht wird und sich die Schlagzahl nicht vermindert (0 nicht unterschreitet)