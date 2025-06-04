package de.itagile.golf;

import java.util.List;

public class SimpleScorecard implements Scorecard {

	private int currentHole = 1;
	private int hitCount;

	public void increaseHitCount() {
		hitCount++;
	}

	public void finishHole() {
		currentHole++;
		hitCount = 0;
	}

	public int hitCount() {
		return hitCount;
	}

	public int currentHole() {
		return currentHole;
	}

	@Override
	public List<Integer> hitsPerHole() {
		// TODO Implement this
		return null;
	}
}
