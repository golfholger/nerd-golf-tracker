package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class SimpleScorecardTest {

	private Scorecard scorecard = new SimpleScorecard();
	
	@Test
	void incrementHitOnce() {
		scorecard.increaseHitCount();

		assertThat(scorecard.hitCount(), is(1));
	}
	
	@Test
	void incrementHitsMultipleTimes() {
		scorecard.increaseHitCount();
		scorecard.increaseHitCount();
		assertThat(scorecard.hitCount(), is(2));
	}
	
	@Test
	void resetHitCount() {
		scorecard.increaseHitCount();
		scorecard.finishHole();
		assertThat(scorecard.hitCount(), is(0));
	}
	
	@Test
	void initiallyOnFirstHole() {
		assertThat(scorecard.currentHole(), is(1));
	}
	
	@Test
	void countsHoles() {
		scorecard.finishHole();
		assertThat(scorecard.currentHole(), is(2));
	}
	@Test
	void scorecardInitial() {
		assertThat(scorecard.hitsPerHole().size(), is(1));
		assertThat(scorecard.hitsPerHole().get(0), is(0));
	}

	@Test
	void scorecardHitOnce() {
		scorecard.increaseHitCount();
		assertThat(scorecard.hitsPerHole().size(), is(1));
		assertThat(scorecard.hitsPerHole().get(0), is(1));
	}

	@Test
	void scorecardHitMultiple() {
		scorecard.increaseHitCount();
		scorecard.increaseHitCount();
		scorecard.increaseHitCount();
		assertThat(scorecard.hitsPerHole().size(), is(1));
		assertThat(scorecard.hitsPerHole().get(0), is(3));
	}

	@Test
	void scorecardFinishHole() {
		scorecard.finishHole();
		assertThat(scorecard.hitsPerHole().size(), is(2));
		assertThat(scorecard.hitsPerHole().get(0), is(0));
		assertThat(scorecard.hitsPerHole().get(1), is(0));
	}

	@Test
	void scorecardFinishHolesHitMultiple() {
		scorecard.increaseHitCount();
		scorecard.increaseHitCount();
		scorecard.increaseHitCount();
		scorecard.finishHole();
		scorecard.increaseHitCount();
		scorecard.increaseHitCount();
		scorecard.finishHole();
		scorecard.increaseHitCount();
		assertThat(scorecard.hitsPerHole().size(), is(3));
		assertThat(scorecard.hitsPerHole().get(0), is(3));
		assertThat(scorecard.hitsPerHole().get(1), is(2));
		assertThat(scorecard.hitsPerHole().get(2), is(1));
	}

}
