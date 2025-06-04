package de.itagile.golf.operation;

import java.util.List;

import org.junit.jupiter.api.Test;

import de.itagile.golf.Scorecard;
import de.itagile.golf.util.SystemProperties;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ScorecardOutputTest {

  @Test
  void testOneHoleScorecardOutput() {
    Scorecard scorecard  = mock(Scorecard.class);
    when(scorecard.hitsPerHole()).thenReturn(List.of(0));
    assertEquals( "Hole 1: 0", new ScorecardOutput().execute(scorecard));
  }

  @Test
  void testOneHoleWithOneHitScorecardOutput() {
    Scorecard scorecard  = mock(Scorecard.class);
    when(scorecard.hitsPerHole()).thenReturn(List.of(1));
    assertEquals( "Hole 1: 1", new Hit(new ScorecardOutput()).execute(scorecard));
  }

  @Test
  void testTwoHoleScorecardOutput() {
    Scorecard scorecard  = mock(Scorecard.class);
    when(scorecard.hitsPerHole()).thenReturn(List.of(0, 0));
    assertEquals( "Hole 1: 0"+ SystemProperties.LINE_SEPARATOR +"Hole 2: 0", new ScorecardOutput().execute(scorecard));
  }
}
