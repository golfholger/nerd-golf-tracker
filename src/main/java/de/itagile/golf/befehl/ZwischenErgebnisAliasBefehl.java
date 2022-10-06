package de.itagile.golf.befehl;

public class ZwischenErgebnisAliasBefehl extends ZwischenErgebnisBefehl {

    @Override
    public String kommando() {
        return "z";
    }
    @Override
    public boolean showInHelp() {
        return false;
    }

}
