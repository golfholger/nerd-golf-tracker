package de.itagile.golf;

import de.itagile.golf.befehl.BeendenAliasBefehl;
import de.itagile.golf.befehl.BeendenBefehl;
import de.itagile.golf.befehl.HilfeAliasBefehl;
import de.itagile.golf.befehl.HilfeBefehl;
import de.itagile.golf.befehl.LochwechselAliasBefehl;
import de.itagile.golf.befehl.LochwechselBefehl;
import de.itagile.golf.befehl.SchlagAliasBefehl;
import de.itagile.golf.befehl.SchlagBefehl;
import de.itagile.golf.befehl.StandardBefehl;
import de.itagile.golf.befehl.UndoLetzterSchlagAliasBefehl;
import de.itagile.golf.befehl.UndoLetzterSchlagBefehl;
import java.util.ArrayList;
import java.util.List;

public class BefehleSammler {

	public List<Befehl> sammle() {
		List<Befehl> ernte = new ArrayList<>();
		ernte.add(new SchlagBefehl());
		ernte.add(new SchlagAliasBefehl());
		ernte.add(new LochwechselBefehl());
		ernte.add(new LochwechselAliasBefehl());
		ernte.add(new HilfeBefehl());
		ernte.add(new UndoLetzterSchlagBefehl());
		ernte.add(new UndoLetzterSchlagAliasBefehl());
		ernte.add(new BeendenBefehl());
		ernte.add(new BeendenAliasBefehl());
		ernte.add(new HilfeAliasBefehl());
		ernte.add((new StandardBefehl()));
		return ernte;
	}
}
