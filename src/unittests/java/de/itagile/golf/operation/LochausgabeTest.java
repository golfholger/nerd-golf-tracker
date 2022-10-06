package de.itagile.golf.operation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.itagile.golf.EinfacheScorecard;
import de.itagile.golf.Scorecard;
import org.junit.Test;

public class LochausgabeTest {


	@Test
	public void gibtAktuellesLochAus() throws Exception {
		Scorecard scorecard = mock(Scorecard.class);
		when(scorecard.aktuellesLoch()).thenReturn(42);
		assertThat(new Lochausgabe().fuehreAus(scorecard), containsString("42. Loch"));
	}

	@Test
	public void zeigAktuellesPar() {
		Scorecard scorecard = new EinfacheScorecard();
		assertThat(new Lochausgabe().fuehreAus(scorecard), containsString("(Par 4)"));
		scorecard.schliesseLochAb();
		assertThat(new Lochausgabe().fuehreAus(scorecard), containsString("(Par 5)"));
		scorecard.schliesseLochAb();
		assertThat(new Lochausgabe().fuehreAus(scorecard), containsString("(Par 3)"));
	}
}
