package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Beenden implements Operation {
    @Override
    public String fuehreAus(Scorecard scorecard) {
        return "Wir sehen uns am 19. Loch!";
    }
}
