import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class EvenOddCheckerTestNGTest {
    @Test
    public void evenNumTest() {
        assertTrue(EvenOddChecker.check(2), "Even number check failed");
    }

    @Test
    public void oddNumTest() {
        assertFalse(EvenOddChecker.check(3), "Odd number check failed");
    }
}
