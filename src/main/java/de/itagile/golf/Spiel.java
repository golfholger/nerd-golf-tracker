package de.itagile.golf;

import de.itagile.golf.befehl.BeendenBefehl;
import de.itagile.golf.konsole.Konsole;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Startausgabe;

import java.io.IOException;

public class Spiel {
    public void start() throws IOException {
        Konsole konsole = new Konsole();

        Startausgabe startoperation = new Startausgabe(new Lochausgabe());
        Tracker tracker = new Tracker(new EinfacherInterpreter(), startoperation);

        konsole.println(tracker.starte()).beendeAusgabe();

        boolean isRunning = true;
        while (isRunning) {
            String befehl = konsole.liesZeileEin();
            konsole.println(tracker.reagiereAuf(befehl)).beendeAusgabe();
            if (istBeenden(befehl)) {
                isRunning = false;
            }
        }
    }

    public boolean istBeenden(String befehl) {
        return new BeendenBefehl().kommando().toLowerCase().equals(befehl.toLowerCase());
    }
}
