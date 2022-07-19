package failures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CompareValues {

    @Test
    void failingTestShouldTellYouWhatsWrong() {
        String value = "value";
        String otherValue = "otherValue";

        assertTrue(value.equals(otherValue));
    }

}
