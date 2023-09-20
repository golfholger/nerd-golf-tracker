package de.itagile.golf;

import de.itagile.golf.befehl.BeendenBefehl;
import de.itagile.golf.konsole.Konsole;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Startausgabe;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Konsole konsole = new Konsole();
		
		Startausgabe startoperation = new Startausgabe(new Lochausgabe());
		Tracker tracker = new Tracker(new EinfacherInterpreter(), startoperation);

		konsole.println(tracker.starte()).beendeAusgabe();

		boolean isRunning = true;
		while (isRunning) {
			String befehl = konsole.liesZeileEin();
			konsole.println(tracker.reagiereAuf(befehl)).beendeAusgabe();
			if (new BeendenBefehl().kommando().equals(befehl)) {
				isRunning = false;
			}
		}
	}
}