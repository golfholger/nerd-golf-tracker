Feature: Hilfe

	Scenario Outline: Eintrag in der Hilfe
        When ich die Hilfe aufrufe
        Then steht in der ersten Zeile ein einleitender Text mit Zeilenumbruch
        And listet der NerdGolfTracker einen Eintrag zu <Kommando> auf

        Examples:
            |Kommando|
            |Schlage Ball|
            |Nächstes Loch|
            |Hilfe|
