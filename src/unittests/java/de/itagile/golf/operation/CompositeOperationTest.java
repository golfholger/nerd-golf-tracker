package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;

public class CompositeOperationTest {

    @Test
    void returnString() {
        CompositeOperation composite = new CompositeOperation();

        Scorecard scorecard = mock(Scorecard.class);
        assertThat(composite.fuehreAus(scorecard), is(""));
    }

    @Test
    void canExecuteOneOperation() {
        Scorecard scorecard = mock(Scorecard.class);
        Operation operation = mock(Operation.class);
        Mockito.when(operation.fuehreAus(scorecard)).thenReturn("foo");
        CompositeOperation composite = new CompositeOperation(operation);

        assertThat(composite.fuehreAus(scorecard), is("foo"));
    }

    @Test
    void canExecuteTwoOperationsInOrder() {
        Scorecard scorecard = mock(Scorecard.class);
        Operation operation1 = mock(Operation.class);
        Operation operation2 = mock(Operation.class);
        CompositeOperation composite = new CompositeOperation(operation1, operation2);

        InOrder inOrder = Mockito.inOrder(operation1, operation2);
        composite.fuehreAus(scorecard);

        inOrder.verify(operation1).fuehreAus(scorecard);
        inOrder.verify(operation2).fuehreAus(scorecard);
    }
}
