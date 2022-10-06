package de.itagile.golf;

public class EinfacheScorecard implements Scorecard {

    private static final int[] par = new int[]{4, 5, 3, 4, 3, 4, 5, 4, 3, 5, 4, 5, 4, 3, 4, 4, 3,
        5};

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

    public void geheLochZurück(){
        if (aktuellesLoch > 1)
            aktuellesLoch--;
    }

    @Override
    public int aktuellesPar() {
        return par[aktuellesLoch() - 1];
    }
}
