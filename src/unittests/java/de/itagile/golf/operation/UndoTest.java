package de.itagile.golf.operation;

import de.itagile.golf.EinfacheScorecard;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class UndoTest {
    private final Scorecard scorecard = new EinfacheScorecard();
    private final Operation folgeoperation = mock(Operation.class);
    private final UndoLetzterSchlag undoLetzterSchlag = new UndoLetzterSchlag(folgeoperation);

    private final UndoLochwechsel undoLochwechsel = new UndoLochwechsel(folgeoperation);

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

    @Test
    public void undoLochwechsel() {
        scorecard.erhoeheAnzahlSchlaege();
        scorecard.erhoeheAnzahlSchlaege();
        scorecard.schliesseLochAb();
        undoLochwechsel.fuehreAus(scorecard);
        Assert.assertEquals(1, scorecard.aktuellesLoch());
        Assert.assertEquals(2, scorecard.anzahlSchlaege());
    }
}
