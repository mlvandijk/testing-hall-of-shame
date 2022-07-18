package failures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CompareValues {

    /*
    * While the test below fails when comparing values, the result does not provide as much information as it could.
    * As IntelliJ IDEA will tell you here, we can replace the assertTrue() with an assertEquals() to compare the actual values.
    */
    @Test
    void failingTestShouldTellYouWhatsWrong() {
        String value = "value";
        String otherValue = "otherValue";

        assertTrue(value.equals(otherValue));
    }

    /*
     * When we compare the actual values, the failure will tell us the actual and expected value, so we can see the difference.
     */
    @Test
    void failingTestShouldTellYouWhatsWrongQuickly() {
        String value = "value";
        String otherValue = "otherValue";

        assertEquals(value, otherValue);
    }

}
