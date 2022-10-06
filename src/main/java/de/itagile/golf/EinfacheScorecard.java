package de.itagile.golf;

public class EinfacheScorecard implements Scorecard {

    private static final int[] par = new int[]{4, 5, 3, 4, 3, 4, 5, 4, 3, 5, 4, 5, 4, 3, 4, 4, 3,
        5};

    private int aktuellesLoch = 1;
    private int anzahlSchlaege;

    public void erhoeheAnzahlSchlaege() {
        anzahlSchlaege++;
    }

    public void reduziereAnzahlSchlaege() {
        if (anzahlSchlaege > 0) {
            anzahlSchlaege--;
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

    public void geheLochZurück(){
        if (aktuellesLoch > 1)
            aktuellesLoch--;
    }

    @Override
    public int aktuellesPar() {
        return par[aktuellesLoch() - 1];
    }
}
