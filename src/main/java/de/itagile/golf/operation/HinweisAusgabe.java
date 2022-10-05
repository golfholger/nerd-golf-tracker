package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class HinweisAusgabe implements Operation {

    private final Operation folgeoperation;

    public HinweisAusgabe(Operation folgeoperation) {
        this.folgeoperation = folgeoperation;
    }


    @Override
    public String fuehreAus(Scorecard scorecard) {
        return "Hinweis: Du hast eine unbekannte Eingabe getätigt. Ich zeige dir die Hilfe an.\nHilfe:\n" + this.folgeoperation.fuehreAus(scorecard);
    }
}
