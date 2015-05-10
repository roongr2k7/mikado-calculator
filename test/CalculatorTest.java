import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void compute() {
        assertEquals(1, new ValueNode(1).compute());
        assertEquals(2, new ValueNode(2).compute());
    }

    @Test
    public void computePlus() {
        assertEquals(2, new OperatorNode("+", new ValueNode(1), new ValueNode(1)).compute());
        assertEquals(3, new OperatorNode("+", new ValueNode(2), new ValueNode(1)).compute());
    }

    @Test
    public void computeMinus() {
        assertEquals(1, new OperatorNode("-", new ValueNode(2), new ValueNode(1)).compute());
        assertEquals(2, new OperatorNode("-", new ValueNode(3), new ValueNode(1)).compute());
    }

    @Test
    public void stringValueNode() {
        assertEquals("1", new ValueNode(1).toString());
    }

    @Test
    public void stringPlusEquation() {
        assertEquals("1 + 1", new OperatorNode("+", new ValueNode(1), new ValueNode(1)).toString());
    }

    @Test
    public void stringMinusEquation() {
        assertEquals("1 - 1", new OperatorNode("-", new ValueNode(1), new ValueNode(1)).toString());
    }
}
