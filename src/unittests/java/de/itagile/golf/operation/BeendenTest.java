package de.itagile.golf.operation;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.fehler.AnwendungSchliessenException;

public class BeendenTest {

	private Operation beenden = new Beenden();
	
	@Test(expected = AnwendungSchliessenException.class)
	public void beendenTest() throws Exception {
		beenden.fuehreAus(null);
	}
}
