import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class EvenOddCheckerJUnitTest {
    @Test
    public void evenNumTest() {
        assertTrue("Even number check failed", EvenOddChecker.check(2));
    }

    @Test
    public void oddNumTest() {
        assertFalse("Odd number check failed", EvenOddChecker.check(3));
    }
}
