package de.itagile.golf;

public class EinfacheScorecard implements Scorecard {

    private int aktuellesLoch = 1;
    private int anzahlSchlaege;

    private int zwischenErgebnis;

	public void erhoeheAnzahlSchlaege() {
        anzahlSchlaege++;
        zwischenErgebnis++;
	}

    public void reduziereAnzahlSchlaege() {
        if (anzahlSchlaege > 0) {
            anzahlSchlaege--;
            zwischenErgebnis--;
        }
    }

    public void schliesseLochAb() {
        aktuellesLoch++;
        anzahlSchlaege = 0;
    }

    public int anzahlSchlaege() {
        return anzahlSchlaege;
    }

    public int aktuellesLoch() {
        return aktuellesLoch;
    }

    @Override
    public int zwischenErgebnis() {
        return zwischenErgebnis;
    }
}
