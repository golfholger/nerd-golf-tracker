package de.itagile.golf.operation;

import static de.itagile.golf.Befehle.SCHLAG;
import static de.itagile.golf.util.SystemProperties.LINE_SEPARATOR;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import de.itagile.golf.util.SystemProperties;
import org.junit.Test;

public class HilfeTest {

	@Test
	public void zeigtIntroAn() throws Exception {
		assertThat(new Hilfe().fuehreAus(null),
				containsString("Ich reagiere auf:" + SystemProperties.LINE_SEPARATOR));
	}

	@Test
	public void zeigtBeschreibungZumKommando() throws Exception {
		assertThat(new Hilfe().fuehreAus(null),
				containsString(SCHLAG.getKommando() + " (..." + SCHLAG.getHilfeText()));
		containsString("Alias");
	}

	@Test
	public void gibtProKommandoEineZeileAus() throws Exception {
		String hilfetext = new Hilfe().fuehreAus(null);
		assertThat(anzahlZeilen(hilfetext), is(9));
	}

	private int anzahlZeilen(String string) {
		String[] zeilen = string.split(LINE_SEPARATOR);
		return zeilen.length;
	}
}
