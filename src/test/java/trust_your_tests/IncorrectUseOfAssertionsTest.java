package trust_your_tests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IncorrectUseOfAssertionsTest {

    /*
    * As IntelliJ will tell you here, the result of assertThat() is ignored.
    * This test will never fail.
    */
    @Test
    void incorrectUseOfAssertThat() {
        String x = "x";

        assertThat(x);
    }

    /*
     * We need to combine assertThat() with an actual assertion.
     * The test below will fail because the actual and expected String are not the same.
     * Once we have seen it fail, we can change the expected String to what we expect
     * and trust that this test will protect us from failures in the future.
     */
    @Test
    void correctUseOfAssertThat() {
        String actual = "x";
        String expected = "y";

        assertThat(actual).isEqualTo(expected);
    }
}
