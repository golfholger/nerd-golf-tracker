package de.itagile.golf.operation;

import de.itagile.golf.BefehleSammler;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;

public class UnbekannteEingabeTest {

    private Scorecard scorecard = mock(Scorecard.class);
    private Operation folgeOperation = mock(Operation.class);

    @Before
    public void setup() {
        scorecard = mock(Scorecard.class);
        folgeOperation = mock(Operation.class);
    }

    @Test
    public void zeigtHinweisAn(){
        assertThat(hinweisText(),containsString("Hinweis"));
    }

    private String hinweisText(){
        return new HinweisAusgabe(new Hilfe(new BefehleSammler())).fuehreAus(scorecard);
    }
}
