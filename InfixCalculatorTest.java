import org.junit.Test;
import static org.junit.Assert.*;

public class InfixCalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(10, InfixCalculator.calculator('+', 5, 5));
    }
}
