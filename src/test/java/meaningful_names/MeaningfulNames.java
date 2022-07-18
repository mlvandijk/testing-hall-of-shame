package meaningful_names;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MeaningfulNamesTest {


    /*
    * The test scenarios below do not tell us anything about what is being tested or why.
    * They provide no information of how the system should behave.
    */
    @Test
    void testScenario1() {
        // your test code here
    }

    @Test
    void testScenario2() {
        // your test code here
    }

    // etc














    /*
     * While the test below is marginally better,
     * it still doesn't provide us with information about why we expect a certain result.
     */
    @Test
    @DisplayName("should return expected result")
    void shouldReturnExpectedResult() {
        // your test code here
    }


    /*
     * This is even better as we can see what the expected output is.
     * There are many details that can be added; what is relevant might depend on your context.
     */
    @Test
    @DisplayName("input x should return output y")
    void xShouldReturnY() {
        // your test code here
    }

}
