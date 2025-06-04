package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import de.itagile.golf.util.SystemProperties;

public class ScorecardOutput implements Operation {


  @Override
  public String execute(final Scorecard scorecard) {
    StringBuilder output = new StringBuilder();
    for(int i = 0; i < scorecard.hitsPerHole().size(); i++) {
         output.append("Hole ").append(i +1).append(": ").append(scorecard.hitsPerHole().get(i)).append(
           SystemProperties.LINE_SEPARATOR);
    }

    return output.toString().trim();

  }
}
