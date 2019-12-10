package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.Zwischenergebnisausgabe;

public class ZwischenergebnisBefehl implements Befehl {

	public Zwischenergebnisausgabe operation() {
		return new Zwischenergebnisausgabe();
	}

	public String kommando() {
		return "Zwischenergebnis ausgeben";
	}
	
	public String beschreibung() {
		return "dann gebe ich die Gesamtanzahl Schläge aus";
	}

}
