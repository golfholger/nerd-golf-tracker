package de.itagile.golf;

import de.itagile.golf.fehler.AnwendungSchließenException;

public interface Operation {

	String fuehreAus(Scorecard scorecard) throws AnwendungSchließenException;

}
