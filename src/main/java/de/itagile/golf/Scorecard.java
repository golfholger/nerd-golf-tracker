package de.itagile.golf;

import java.util.List;

public interface Scorecard {

	void erhoeheAnzahlSchlaege();

	int anzahlSchlaege();

	void schliesseLochAb();

	int aktuellesLoch();

	List<Integer> anzahlSchlaegeProLoch();

}
