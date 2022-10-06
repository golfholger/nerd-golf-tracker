package de.itagile.golf;

public interface Scorecard {

	void erhoeheAnzahlSchlaege();

	void reduziereAnzahlSchlaege();

	int anzahlSchlaege();

	void schliesseLochAb();

	int aktuellesLoch();

	void geheLochZurück();

	int aktuellesPar();

}