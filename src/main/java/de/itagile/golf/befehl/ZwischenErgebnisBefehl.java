package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.operation.ZwischenErgebnisAusgabe;

public class ZwischenErgebnisBefehl implements Befehl {

    public ZwischenErgebnisAusgabe operation() {
        return new ZwischenErgebnisAusgabe();
    }

    public String kommando() {
        return "Zwischenergebnis";
    }

    public String beschreibung() {
        return "dann wird das Zwischenergebnis angezeigt. Alias: z";
    }
}
