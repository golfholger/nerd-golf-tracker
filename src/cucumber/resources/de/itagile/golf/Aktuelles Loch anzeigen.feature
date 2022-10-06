# language: de
Funktionalität: Aktuelles Loch anzeigen

  Szenario: direkt nach dem Start
    Wenn ich den NerdGolfTracker starte
    Dann bin ich auf dem 1. Loch

  Szenario: auf dem 2. Loch
    Wenn ich zum nächsten Loch gehe
    Dann bin ich auf dem 2. Loch

  Szenariogrundriss: Par anzeigen
    Wenn ich auf dem Loch <loch> bin
    Dann wird mir das Par <par> angezeigt
    Beispiele:
      | loch | par |
      | 1    | 4   |
      | 5    | 3   |
      | 10   | 5   |
      | 18   | 5   |
