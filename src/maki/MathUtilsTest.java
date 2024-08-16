package maki;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MathUtilsTest {

    @Test
    public void testSquare() {
        int testNumber = 4;

        // Incorrect assertion: Expected value is set to 15 instead of 16
        assertEquals("The square of 4 should be 16", 15, MathUtils.square(testNumber));
    }
}
