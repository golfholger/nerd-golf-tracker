Feature: Hilfe

	Scenario Outline: Eintrag in der Hilfe
        When ich die Hilfe aufrufe
	And "Ich reagiere auf: " steht in der ersten Zeile mit Zeilenumbruch
        Then listet der NerdGolfTracker einen Eintrag zu <Kommando> auf

        Examples:
            |Kommando|
            |Schlage Ball|
            |Nächstes Loch|
            |Hilfe|
