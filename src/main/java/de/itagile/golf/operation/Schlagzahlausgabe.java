package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Schlagzahlausgabe implements Operation {

    private Operation folgeoperation;

    public Schlagzahlausgabe(Operation folgeoperation) {
        this.folgeoperation = folgeoperation;
    }

    @Override
    public String fuehreAus(Scorecard scorecard) {
        int anzahlSchlaege = scorecard.anzahlSchlaege();
        String schlagNomen = anzahlSchlaege == 1 ? "Schlag" : "Schläge";
        String vorlage = "Du hast %d %s %s";
        return String.format(vorlage,
                anzahlSchlaege,
                schlagNomen,
                folgeoperation.fuehreAus(scorecard));
    }
}
