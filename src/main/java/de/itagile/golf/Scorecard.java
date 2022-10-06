package de.itagile.golf;

public interface Scorecard {

	void erhoeheAnzahlSchlaege();

	void reduziereAnzahlSchlaege();

	int anzahlSchlaege();

	void schliesseLochAb();

	int aktuellesLoch();

    int zwischenErgebnis();

	void geheLochZurück();

	int aktuellesPar();

}