package de.itagile.golf.operation;

import de.itagile.golf.Scorecard;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;

public class BeendenTest {

    private final Scorecard scorecard = mock(Scorecard.class);
    private final Beenden beenden = new Beenden();

    @Test
    public void beendenOperationKannErstelltWerden() {
        assertThat(beenden.fuehreAus(scorecard), containsString("Wir sehen uns am 19. Loch!"));
    }
}
