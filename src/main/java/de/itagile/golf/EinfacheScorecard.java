package de.itagile.golf;

public class EinfacheScorecard implements Scorecard {

    private static final int[] par = new int[]{4, 5, 3, 4, 3, 4, 5, 4, 3, 5, 4, 5, 4, 3, 4, 4, 3,
            5};

    private final int[] anzahlSchlaegeProLoch = new int[18];

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
        anzahlSchlaegeProLoch[aktuellesLoch - 1] = anzahlSchlaege;
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

    public void geheLochZurück() {
        if (aktuellesLoch > 1) {
            aktuellesLoch--;
            anzahlSchlaege = anzahlSchlaegeProLoch[aktuellesLoch - 1];
        }
    }

    @Override
    public int aktuellesPar() {
        return par[aktuellesLoch() - 1];
    }
}
