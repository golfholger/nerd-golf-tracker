package de.itagile.golf.operation;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;


public class SchlagTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Schlag schlag = new Schlag();

	@Test
	public void erhoehtAnzahlSchlaegeAufScorecard() throws Exception {
		schlag.fuehreAus(scorecard);
		verify(scorecard).erhoeheAnzahlSchlaege();
	}

}
