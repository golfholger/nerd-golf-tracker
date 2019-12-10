package de.itagile.golf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class EinfacheScorecardTest {

	private Scorecard scorecard = new EinfacheScorecard();
	
	@Test
	public void inkrementiertSchlagzahlEinmal() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		assertThat(scorecard.anzahlSchlaegeAktuellesLoch(), is(1));
	}
	
	@Test
	public void inkrementiertSchlagzahlMehrmals() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		assertThat(scorecard.anzahlSchlaegeAktuellesLoch(), is(2));
	}
	
	@Test
	public void setztSchlagzahlZurueck() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
		assertThat(scorecard.anzahlSchlaegeAktuellesLoch(), is(0));
	}
	
	@Test
	public void hatInitialErstesLoch() throws Exception {
		assertThat(scorecard.aktuellesLoch(), is(1));
	}
	
	@Test
	public void zaehltAktuellesLoch() throws Exception {
		scorecard.schliesseLochAb();
		assertThat(scorecard.aktuellesLoch(), is(2));
	}
	
	@Test
	public void zaehleGesamtanzahlSchlaegeAmErstenLochVorErstemSchlag() throws Exception {
		assertThat(scorecard.anzahlSchlaegeGesamt(), is(0));
	}
	
	@Test
	public void zaehleGesamtanzahlSchlaegeAmErstenLochNachErstemSchlag() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		assertThat(scorecard.anzahlSchlaegeGesamt(), is(1));
	}	
	
	@Test
	public void zaehleGesamtanzahlSchlaegeAmZweitenLochVorErstemSchlag() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
		assertThat(scorecard.anzahlSchlaegeGesamt(), is(1));
	}
	
	@Test
	public void zaehleGesamtanzahlSchlaegeAmZweitenLochNachErstemSchlag() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
		scorecard.erhoeheAnzahlSchlaege();
		assertThat(scorecard.anzahlSchlaegeGesamt(), is(2));
	}	
}
