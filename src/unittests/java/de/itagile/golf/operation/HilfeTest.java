package de.itagile.golf.operation;

import static de.itagile.golf.util.SystemProperties.LINE_SEPARATOR;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.itagile.golf.Befehl;
import de.itagile.golf.BefehleSammler;
import de.itagile.golf.util.SystemProperties;
import org.junit.Test;

public class HilfeTest {

	@Test
	public void zeigtIntroAn() throws Exception {
		assertThat(hilfetext(), containsString("Ich reagiere auf:"+ SystemProperties.LINE_SEPARATOR));
	}

	@Test
	public void zeigtBeschreibungZumKommando() throws Exception {
		assertThat(hilfetext(dummyBefehl("Kommando", "Beschreibung")),
				containsString("Kommando (...Beschreibung)"));
		containsString("Alias");
	}

	@Test
	public void gibtProKommandoEineZeileAus() throws Exception {
		Befehl befehl1 = mock(Befehl.class);
		Befehl befehl2 = mock(Befehl.class);
		when(befehl1.showInHelp()).thenReturn(true);
		when(befehl2.showInHelp()).thenReturn(true);
		String hilfetextFuerZweiBefehle = hilfetext(befehl1, befehl2);
		assertThat(anzahlZeilen(hilfetextFuerZweiBefehle), is(3));
	}

	private int anzahlZeilen(String string) {
		String[] zeilen = string.split(LINE_SEPARATOR);
		return zeilen.length;
	}

	private String hilfetext(Befehl... befehle) {
		BefehleSammler sammler = mock(BefehleSammler.class);
		
		Hilfe hilfe = new Hilfe(sammler);
		when(sammler.sammle()).thenReturn(asList(befehle));
		return hilfe.fuehreAus(null);
	}

	private Befehl dummyBefehl(String kommando, String beschreibung) {
		Befehl befehl = mock(Befehl.class);
		when(befehl.kommando()).thenReturn(kommando);
		when(befehl.beschreibung()).thenReturn(beschreibung);
		when(befehl.showInHelp()).thenReturn(true);
		return befehl;
	}
}
