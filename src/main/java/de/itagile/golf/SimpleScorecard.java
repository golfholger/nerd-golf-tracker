package de.itagile.golf;

import java.util.ArrayList;
import java.util.List;

public class SimpleScorecard implements Scorecard {

	private int currentHole = 1;
	private int hitCount;

	private List<Integer> hitsPerHole;

	public SimpleScorecard(){
		hitsPerHole = new ArrayList<>();
		hitsPerHole.add(0);
	}

	public void increaseHitCount() {
		hitCount++;

		hitsPerHole.set(currentHole - 1, hitCount);
	}

	public void finishHole() {
		currentHole++;
		hitCount = 0;
		hitsPerHole.add(0);
	}

	public int hitCount() {
		return hitCount;
	}

	public int currentHole() {
		return currentHole;
	}

	@Override
	public List<Integer> hitsPerHole() {
		return hitsPerHole;
	}
}
