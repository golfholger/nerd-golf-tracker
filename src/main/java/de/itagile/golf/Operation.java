package de.itagile.golf;

import de.itagile.golf.fehler.AnwendungSchliessenException;

public interface Operation {

	String fuehreAus(Scorecard scorecard) throws AnwendungSchliessenException;

}
