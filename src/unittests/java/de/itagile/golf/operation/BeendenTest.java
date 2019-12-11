package de.itagile.golf.operation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

import de.itagile.golf.EinfacheScorecard;
import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class BeendenTest {

	private Operation beenden = new Beenden();
	
	@Test
	public void beendenTest() {
		Scorecard scorecard = new EinfacheScorecard();
		scorecard.programmBeendenAusfuehren();
		beenden.fuehreAus(scorecard);
		assertThat(scorecard.programmBeendenPruefen(), equalTo(true));
	}
}
