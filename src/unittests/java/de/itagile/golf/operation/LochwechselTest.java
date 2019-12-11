package de.itagile.golf.operation;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import de.itagile.golf.Scorecard;


public class LochwechselTest {
	
	private Scorecard scorecard;
	private Lochwechsel lochwechsel;

	@Before
	public void setup() {
		scorecard = mock(Scorecard.class);
		lochwechsel = new Lochwechsel();		
	}
	
	@Test
	public void setztAnzahlSchlaegeZurueck() throws Exception {
		lochwechsel.fuehreAus(scorecard);
		verify(scorecard).schliesseLochAb();
	}
	
	
}
