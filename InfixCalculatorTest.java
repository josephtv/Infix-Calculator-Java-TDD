import org.junit.Test;
import static org.junit.Assert.*;

public class InfixCalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(10, InfixCalculator.calculator('+', 5, 5));
    }

    @Test
    public void testAddition_NotEquals() {
        assertNotEquals(15, InfixCalculator.calculator('+', 5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(0, InfixCalculator.calculator('-', 5, 5));
    }

}
