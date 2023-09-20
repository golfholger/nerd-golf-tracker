package de.itagile.golf;

import java.util.ArrayList;
import java.util.List;

public class EinfacheScorecard implements Scorecard {

	private int aktuellesLoch = 1;
	private List<Integer> anzahlSchlaegeProLoch = new ArrayList<>(List.of(0));

	public void erhoeheAnzahlSchlaege() {
		Integer neueSchlagzahl = anzahlSchlaegeProLoch.get(aktuellesLoch - 1) + 1;
		anzahlSchlaegeProLoch.set(aktuellesLoch - 1, neueSchlagzahl);
	}

	public void schliesseLochAb() {
		aktuellesLoch++;
		anzahlSchlaegeProLoch.add(0);
	}

	public int anzahlSchlaege() {
		return anzahlSchlaegeProLoch.get(aktuellesLoch - 1);
	}

	public int aktuellesLoch() {
		return aktuellesLoch;
	}

	@Override
	public List<Integer> anzahlSchlaegeProLoch() {
		return anzahlSchlaegeProLoch;
	}
}
