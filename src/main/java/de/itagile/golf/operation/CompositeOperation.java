package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class CompositeOperation implements Operation {

    private Operation operation;

    private Operation operation1;
    private Operation operation2;

    public CompositeOperation() {
    }

    public CompositeOperation(Operation operation) {
        this.operation = operation;
    }

    public CompositeOperation(Operation operation1, Operation operation2) {
        this.operation1 = operation1;
        this.operation2 = operation2;
    }

    @Override
    public String fuehreAus(Scorecard scorecard) {
        if (operation1 != null) {
            operation1.fuehreAus(scorecard);
            operation2.fuehreAus(scorecard);
            return "";
        }

        if (operation != null) return operation.fuehreAus(scorecard);

        return "";
    }
}
