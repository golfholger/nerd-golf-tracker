package de.itagile.golf;

import de.itagile.golf.befehl.*;

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
		ernte.add(new StandardBefehl());
        ernte.add(new ZwischenErgebnisBefehl());
        ernte.add(new ZwischenErgebnisAliasBefehl());
		ernte.add(new UndoLochwechselBefehl());
		ernte.add(new UndoLochwechselAliasBefehl());
		return ernte;
	}
}
