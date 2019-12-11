package de.itagile.golf.operation;

import static org.junit.Assert.*;

import org.junit.Test;

public class AusgabeUtilTest {

	
	@Test
	public void getHitsStringForTest() {
		
		assertEquals(AusgabeUtil.getHitsStringFor(0), "Du hast 0 Schläge");
		assertEquals(AusgabeUtil.getHitsStringFor(1), "Du hast 1 Schlag");
		assertEquals(AusgabeUtil.getHitsStringFor(2), "Du hast 2 Schläge");
	} 

}
