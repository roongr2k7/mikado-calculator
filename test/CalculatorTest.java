import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void compute() {
        assertEquals(1, new Node(1).compute());
        assertEquals(2, new Node(2).compute());
    }
}
