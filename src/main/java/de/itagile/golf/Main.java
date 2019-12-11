package de.itagile.golf;

import java.io.IOException;

import de.itagile.golf.konsole.Konsole;
import de.itagile.golf.operation.FolgeOperation;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Startausgabe;

public class Main {

	public static void main(String[] args) throws IOException {
		Konsole konsole = new Konsole();

		FolgeOperation startoperation = new FolgeOperation(new Startausgabe(),new Lochausgabe());
		Tracker tracker = new Tracker(new EinfacherInterpreter(), startoperation);

		konsole.println(tracker.starte()).beendeAusgabe();
		while (!tracker.scorecard.programmBeendenPruefen()) {
//			try {
				String befehl = konsole.liesZeileEin();
				konsole.println(tracker.reagiereAuf(befehl)).beendeAusgabe();
//			} catch (AnwendungSchliessenException e) {
//				konsole.println(e.getMessage()).beendeAusgabe();
//			}
		}
	}
}