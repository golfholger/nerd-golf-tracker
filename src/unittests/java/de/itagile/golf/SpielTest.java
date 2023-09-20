package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SpielTest {
    private Spiel spiel = new Spiel();

    @Test
    public void isBeendenTest() {
        assertThat(spiel.istBeenden("BeEnDeN"), is(true));
    }
}
