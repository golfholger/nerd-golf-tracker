Feature: Unbekannte Eingabe

    Scenario Outline: Gibt Hinweis auf unbekannte Eingabe aus
    When ich eine unbekannte Eingabe mache wie <Unbekannt>
		Then bekomme ich einen Hinweis auf die Hilfe

	Examples:
            |Unbekannt|
            |Test|
            |Falsch|
            |Ganz Falsch|
            |Nachstes Loch|
            |Schlag Ball|