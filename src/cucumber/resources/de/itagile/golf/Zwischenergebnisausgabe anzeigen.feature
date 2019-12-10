Feature: Zwischenergebnisausgabe anzeigen

	Scenario: Ausgabe des Zwischenergebnisses
        When ich den Befehl Zwischenergebnis ausgeben eingebe
        Then wird die Gesamtanzahl 0 Schläge für alle Löcher angezeigt

	Scenario: Ausgabe des Zwischenergebnisses mit Shortcut
        When ich den Befehl Z eingebe
        Then wird die Gesamtanzahl 0 Schläge für alle Löcher angezeigt

            