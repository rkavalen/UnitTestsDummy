import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTestNGTest {
    Calculator calculator = new Calculator();

    @Test
    public void additionTest() {
        assertEquals("Addition test failure", 1, calculator.add(0, 1));
    }

    @Test
    public void substructionTest() {
        assertEquals("Subtraction test failure", 1, calculator.subtract(2, 1));
    }

    @Test
    public void multiplicationTest() {
        assertEquals("Multiplication test failure", 1, calculator.multiply(1, 1));
    }

    @Test
    public void divisionTest() {
        assertEquals("Division test failure", 1, calculator.divide(1, 1));
    }

//    @Test
//    public void divisionByZeroTest() {
//        assertEquals("Division by zero test failure", 1, calculator.divide(1, 0));
//    }
}