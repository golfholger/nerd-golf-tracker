package de.itagile.golf;

import de.itagile.golf.befehl.HilfeBefehl;
import de.itagile.golf.befehl.LochwechselBefehl;
import de.itagile.golf.befehl.SchlagBefehl;
import de.itagile.golf.befehl.StandardBefehl;
import java.util.ArrayList;
import java.util.List;

public class BefehleSammler {

	public List<Befehl> sammle() {
		List<Befehl> ernte = new ArrayList<>();
		ernte.add(new SchlagBefehl());
		ernte.add(new LochwechselBefehl());
		ernte.add(new HilfeBefehl());
		ernte.add((new StandardBefehl()));
		return ernte;
	}
}
