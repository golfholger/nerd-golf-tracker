package de.itagile.golf.operation;

import de.itagile.golf.Scorecard;
import de.itagile.golf.util.SystemProperties;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ScoreCardAusgebenTest {

    private Scorecard scorecard = mock(Scorecard.class);
    private ScoreCardAusgeben scoreCardAusgeben = new ScoreCardAusgeben();

    @Test
    public void gibtEinLochAus() {
        when(scorecard.anzahlSchlaegeProLoch()).thenReturn(List.of(1));
        assertThat(scoreCardAusgeben.fuehreAus(scorecard), containsString("Loch: 1 Schläge: 1" + SystemProperties.LINE_SEPARATOR));
    }

    @Test
    public void gibtZweiLoecherAus(){
        when(scorecard.anzahlSchlaegeProLoch()).thenReturn(List.of(1, 2));
        assertThat(
                scoreCardAusgeben.fuehreAus(scorecard),
                containsString("Loch: 1 Schläge: 1" + SystemProperties.LINE_SEPARATOR)
        );
        assertThat(
                scoreCardAusgeben.fuehreAus(scorecard),
                containsString("Loch: 2 Schläge: 2" + SystemProperties.LINE_SEPARATOR)
        );
    }


    @Test
    public void gibtZweiXLöcherAus(){
        List<Integer> results = List.of(1, 2, 4, 5, 8, 9);
        when(scorecard.anzahlSchlaegeProLoch()).thenReturn(results);

        int index = 1;
        for (Integer lochResult : results) {
            assertThat(
                    scoreCardAusgeben.fuehreAus(scorecard),
                    containsString("Loch: " + index + " Schläge: " + lochResult + SystemProperties.LINE_SEPARATOR)
            );
            index++;
        }

    }




}
