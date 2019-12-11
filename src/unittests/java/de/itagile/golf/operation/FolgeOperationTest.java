package de.itagile.golf.operation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class FolgeOperationTest {

	private final Operation operationA = mock(Operation.class);
	
	private final Operation operationB = mock(Operation.class);
	
	private final Scorecard scorecard = mock(Scorecard.class);
	
	@Test
	public void pruefeOperationWidergabe() throws Exception {
	 Operation folgeOperaion = new FolgeOperation(operationA);
	 when(operationA.fuehreAus(scorecard)).thenReturn("Test123");
	 
	 assertThat(folgeOperaion.fuehreAus(scorecard),equalTo("Test123"));
	}
	
	@Test
	public void pruefeMehrereOperationWidergabe() throws Exception {
	 Operation folgeOperaion = new FolgeOperation(operationA,operationB);
	 when(operationA.fuehreAus(scorecard)).thenReturn("Test123");
	 when(operationB.fuehreAus(scorecard)).thenReturn("Test321");
	 
	 assertThat(folgeOperaion.fuehreAus(scorecard),equalTo("Test123 Test321"));
	}
	
	@Test
	public void pruefeDoppelteOperationWidergabe() throws Exception {
	 Operation folgeOperaion = new FolgeOperation(operationA,operationA);
	 when(operationA.fuehreAus(scorecard)).thenReturn("Test123");
	 
	 assertThat(folgeOperaion.fuehreAus(scorecard),equalTo("Test123 Test123"));
	}
	
	@Test
	public void pruefeLeereOperationWidergabe() throws Exception {
	 Operation folgeOperaion = new FolgeOperation();
	 
	 assertThat(folgeOperaion.fuehreAus(scorecard),equalTo(""));
	}

}
