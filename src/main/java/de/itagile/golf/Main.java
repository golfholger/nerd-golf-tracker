package de.itagile.golf;

import java.io.IOException;

import de.itagile.golf.befehl.BeendenBefehl;
import de.itagile.golf.konsole.Konsole;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Startausgabe;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Konsole konsole = new Konsole();
		
		Startausgabe startoperation = new Startausgabe(new Lochausgabe());
		Tracker tracker = new Tracker(new EinfacherInterpreter(), startoperation);

		konsole.println(tracker.starte()).beendeAusgabe();
		
		while (true) {
			String befehl = konsole.liesZeileEin();
            final String reaktion = tracker.reagiereAuf(befehl);
            konsole.println(reaktion).beendeAusgabe();

            if (beendet(befehl)) break;
        }
	}

    private static boolean beendet(String befehl) {
        final String beendenBefehl = new BeendenBefehl().kommando();
        return beendenBefehl.equalsIgnoreCase(befehl);
    }
}