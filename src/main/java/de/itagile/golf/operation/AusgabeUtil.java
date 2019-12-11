package de.itagile.golf.operation;

public class AusgabeUtil {
	static String getHitsStringFor(int hits) {
		return "Du hast " + hits + (hits == 1 ? " Schlag" : " Schläge");
	}
}
