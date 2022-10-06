package de.itagile.golf.operation;

import de.itagile.golf.EinfacheScorecard;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class UndoTest {
    private Scorecard scorecard = new EinfacheScorecard();
    private Operation folgeoperation = mock(Operation.class);
    private UndoLetzterSchlag undoLetzterSchlag = new UndoLetzterSchlag(folgeoperation);

    @Test
    public void undoLetzterSchlag() {
        scorecard.erhoeheAnzahlSchlaege();
        scorecard.erhoeheAnzahlSchlaege();
        undoLetzterSchlag.fuehreAus(scorecard);

        Assert.assertEquals(1, scorecard.anzahlSchlaege());
    }

    @Test
    public void undoLetzterSchlagFehlschlag() {
        undoLetzterSchlag.fuehreAus(scorecard);

        Assert.assertEquals(0, scorecard.anzahlSchlaege());
    }
}
