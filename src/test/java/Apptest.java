import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator(); // Initializes a new instance before every test
    }

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(7, 3), "7 + 3 should equal 10");
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5), "10 - 5 should equal 5");
    }

    @Test
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5), "4 * 5 should equal 20");
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5), "10 / 5 should equal 2");
    }

    @Test
    void testDivideByZero() {
        // Verifies that the correct exception is thrown for invalid operations
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
