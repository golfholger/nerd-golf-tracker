package de.itagile.golf;

public class EinfacheScorecard implements Scorecard {

	private int aktuellesLoch = 1;
	private int anzahlSchlaegeAktuellesLoch;
	private int anzahlSchlaegeGesamt;
	private boolean programmBeenden = false;
	
	
	public boolean programmBeendenPruefen() {
		return programmBeenden;
	}
	
	public void programmBeendenAusfuehren() {
		programmBeenden = true;
	}

	public void erhoeheAnzahlSchlaege() {
		anzahlSchlaegeAktuellesLoch++;
		anzahlSchlaegeGesamt++;
	}

	public void schliesseLochAb() {
		anzahlSchlaegeAktuellesLoch = 0;
		aktuellesLoch++;
	}

	public int anzahlSchlaegeAktuellesLoch() {
		return anzahlSchlaegeAktuellesLoch;
	}

	public int aktuellesLoch() {
		return aktuellesLoch;
	}

	public int anzahlSchlaegeGesamt() {
		return anzahlSchlaegeGesamt;
	}
}
