package trust_your_tests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IncorrectUseOfAssertionsTest {

    @Test
    void incorrectUseOfAssertThat() {
        String x = "x";

        assertThat(x);
    }
}
