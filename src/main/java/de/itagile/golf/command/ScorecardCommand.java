package de.itagile.golf.command;

import de.itagile.golf.Command;
import de.itagile.golf.CommandCollector;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.ScorecardOutputOperation;

public class ScorecardCommand implements Command {

  @Override
  public String command() {
    return "Scorecard";
  }

  @Override
  public Operation operation() {
    return new ScorecardOutputOperation();
  }

  @Override
  public String description() {
    return "Gives you an overview of the current scorecard";
  }
}
