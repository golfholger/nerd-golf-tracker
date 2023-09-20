package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.util.SystemProperties;

import java.util.List;


public class ScoreCardAusgeben implements Operation {

    @Override
    public String fuehreAus(Scorecard scorecard) {
        StringBuilder results = new StringBuilder();
        List<Integer> anzahlSchlaegeProLoch = scorecard.anzahlSchlaegeProLoch();
        for(int i = 1; i <= anzahlSchlaegeProLoch.size(); i++) {
            results.append("Loch: ")
                    .append(i)
                    .append(" Schläge: ")
                    .append(anzahlSchlaegeProLoch.get(i-1))
                    .append(SystemProperties.LINE_SEPARATOR);
        }
        return results.toString();
    }
}
