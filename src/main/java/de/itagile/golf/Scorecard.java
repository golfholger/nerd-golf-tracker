package de.itagile.golf;

import java.util.List;

public interface Scorecard {

	void increaseHitCount();

	int hitCount();

	void finishHole();

	int currentHole();
	
	List<Integer> hitsPerHole();

}