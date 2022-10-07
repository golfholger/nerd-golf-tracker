# language: de
Funktionalität: Schläge pro Loch zählen

    Szenariogrundriss: Schläge auf einem Loch zählen
        Wenn ich den Ball <x>-mal schlage
        Dann zählt der NerdGolfTracker auch so viele Schläge

        Beispiele:
            |x|
            |1|
            |2|

  Szenariogrundriss: Schläge auf einem Loch zählen mit Alias
    Wenn ich den Ball <x>-mal schlage mit Alias
    Dann zählt der NerdGolfTracker auch so viele Schläge

    Beispiele:
      |x|
      |1|
      |2|

    Szenario: Lochwechsel
        Wenn ich auf einem Loch gespielt habe
        Dann zählen die Schläge auf dem nächsten Loch wieder von 0 an

    Szenario: Default Befehl
        Wenn ich nur die Enter-Taste gedrückt habe
        Dann wird "Schlage Ball" ausgeführt



