package de.itagile.golf.operation;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.itagile.golf.util.SystemProperties;

import org.junit.Test;

import de.itagile.golf.Befehl;
import de.itagile.golf.BefehleSammler;
import de.itagile.golf.Operation;
import de.itagile.golf.fehler.AnwendungSchließenException;

public class BeendenTest {

	private Operation beenden = new Beenden();
	
	@Test(expected = AnwendungSchließenException.class)
	public void beendenTest() throws Exception {
		beenden.fuehreAus(null);
	}
}
