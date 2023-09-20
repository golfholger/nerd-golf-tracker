package de.itagile.golf;

import de.itagile.golf.befehl.BeendenBefehl;
import de.itagile.golf.konsole.Konsole;
import de.itagile.golf.operation.Lochausgabe;
import de.itagile.golf.operation.Startausgabe;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Spiel().start();
	}
}
