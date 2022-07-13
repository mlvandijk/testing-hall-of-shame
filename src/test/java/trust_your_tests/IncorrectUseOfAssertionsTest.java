package trust_your_tests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IncorrectUseOfAssertionsTest {

    /*
    * As IntelliJ will tell you here, the result of assertThat() is ignored.
    * This test will never fail.
    */
    @Test
    void neverTrustATestYouHaventSeenFail() {
        String x = "x";

        assertThat(x);
    }
}
