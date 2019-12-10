package de.itagile.golf.operation;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class SchlagzahlausgabeTest {

	private Scorecard scorecard = mock(Scorecard.class);
	private Operation folgeoperation = mock(Operation.class);
	private Operation schlagzahlausgabe = new Schlagzahlausgabe(folgeoperation);
	
	@Test
	public void meldetEinenSchlag() throws Exception {
		when(scorecard.anzahlSchlaegeAktuellesLoch()).thenReturn(1);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("1 Schlag"));
	}
	
	@Test
	public void meldetZweiSchlaege() throws Exception {
		when(scorecard.anzahlSchlaegeAktuellesLoch()).thenReturn(2);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("2 Schläge"));
	}
	
	@Test
	public void meldetSechsSchlaege() throws Exception {
		when(scorecard.anzahlSchlaegeAktuellesLoch()).thenReturn(6);
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("6 Schläge"));
	}	
	
	@Test
	public void integriertAusgabeDerFolgeoperation() throws Exception {
		when(folgeoperation.fuehreAus(scorecard)).thenReturn("folgeausgabe");
		assertThat(schlagzahlausgabe.fuehreAus(scorecard), containsString("folgeausgabe"));
	}

}
