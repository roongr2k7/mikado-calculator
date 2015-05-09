import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void compute() {
        assertEquals(1, new Node(1).compute());
        assertEquals(2, new Node(2).compute());
    }

    @Test
    public void computePlus() {
        assertEquals(2, new Node("+", new Node(1), new Node(1)).compute());
        assertEquals(3, new Node("+", new Node(2), new Node(1)).compute());
    }

    @Test
    public void computeMinus() {
        assertEquals(1, new Node("-", new Node(2), new Node(1)).compute());
        assertEquals(2, new Node("-", new Node(3), new Node(1)).compute());
    }

    @Test
    public void stringValueNode() {
        assertEquals("1", new Node(1).toString());
    }
}
