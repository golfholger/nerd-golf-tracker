package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ZwischenergebnisAusgabeTest {

	private final Scorecard scorecard = mock(Scorecard.class);
	
	@Test
	public void testeZwischenergebnis() {
        when(scorecard.zwischenErgebnis()).thenReturn(3);
		Assert.assertEquals(3, scorecard.zwischenErgebnis());
	}

}
