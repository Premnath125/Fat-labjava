import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calc.add(6, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calc.multiply(3, 5));
    }
     @Test
    void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        // This checks if the IllegalArgumentException you defined is actually thrown
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("Cannot divide by zero!", exception.getMessage());
    }
}

