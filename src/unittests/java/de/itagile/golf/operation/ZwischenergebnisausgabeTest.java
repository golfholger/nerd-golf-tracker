package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class ZwischenergebnisausgabeTest {
	private Scorecard scorecard = mock(Scorecard.class);
	private Operation zwischenergebnisausgabe = new Zwischenergebnisausgabe();

	@Test
	public void meldetZwischenergebnisVorErstemSchlagAnErstemLoch() throws Exception {
		when(scorecard.gesamtanzahlSchlaege()).thenReturn(0);
		assertThat(zwischenergebnisausgabe.fuehreAus(scorecard), containsString("0 Schläge"));
	}		
}
