package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class ZwischenErgebnisAusgabe implements Operation {

    @Override
    public String fuehreAus(Scorecard scorecard) {
        String vorlage = "Zwischenergebnis: %d";
        return String.format(vorlage,
                scorecard.zwischenErgebnis());
    }
}
