import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void compute() {
        assertEquals(1, OperatorNode.createValueNode(1).compute());
        assertEquals(2, OperatorNode.createValueNode(2).compute());
    }

    @Test
    public void computePlus() {
        assertEquals(2, new OperatorNode("+", OperatorNode.createValueNode(1), OperatorNode.createValueNode(1)).compute());
        assertEquals(3, new OperatorNode("+", OperatorNode.createValueNode(2), OperatorNode.createValueNode(1)).compute());
    }

    @Test
    public void computeMinus() {
        assertEquals(1, new OperatorNode("-", OperatorNode.createValueNode(2), OperatorNode.createValueNode(1)).compute());
        assertEquals(2, new OperatorNode("-", OperatorNode.createValueNode(3), OperatorNode.createValueNode(1)).compute());
    }

    @Test
    public void stringValueNode() {
        assertEquals("1", OperatorNode.createValueNode(1).toString());
    }

    @Test
    public void stringPlusEquation() {
        assertEquals("1 + 1", new OperatorNode("+", OperatorNode.createValueNode(1), OperatorNode.createValueNode(1)).toString());
    }

    @Test
    public void stringMinusEquation() {
        assertEquals("1 - 1", new OperatorNode("-", OperatorNode.createValueNode(1), OperatorNode.createValueNode(1)).toString());
    }
}
