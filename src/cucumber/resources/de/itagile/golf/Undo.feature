# language: de
Funktionalität: Undo ermöglichen

  Szenariogrundriss: Letzten Schlag rückgängig machen
    Wenn Eingabe "<SchlageBallBefehl>" und anschließend "<UndoLetzterSchlagBefehl>" erfolgt
    Dann erwarte, dass der letzte Schlag rückgängig gemacht wird und die Schlagzahl 0 angezeigt wird
    Beispiele:
      | SchlageBallBefehl | UndoLetzterSchlagBefehl |
      | Schlage Ball    | Undo Letzter Schlag  |
      | s    | us   |


  Szenario: Letzten Schlag rückgängig machen und dabei negative Werte verhindern
    Wenn Eingabe "Undo Letzter Schlag" erfolgt und ich aktuell noch keinen Schlag gemacht habe
    Dann erwarte, dass kein Schlag rückgängig gemacht wird und sich die Schlagzahl nicht vermindert (0 nicht unterschreitet)


  Szenariogrundriss: Letzten Lochwechsel rückgängig machen
    Wenn Eingabe "<NächstesLochBefehl>" und anschließend "<UndoLochwechselBefehl>" erfolgt
    Dann erwarte, dass der Lochwechsel rückgängig gemacht wird und Loch 1 angezeigt wird
    Beispiele:
      | NächstesLochBefehl | UndoLochwechselBefehl |
      | Nächstes Loch    | Undo Lochwechsel  |
      | n    | ul   |


  Szenario: Letzten Lochwechsel rückgängig machen und dabei Werte kleiner 1 verhindern
    Wenn Eingabe "Undo Lochwechsel" erfolgt und ich aktuell noch bei Loch 1 bin
    Dann erwarte, dass kein Lochwechsel rückgängig gemacht wird und weiterhin Loch 1 angezeigt wird