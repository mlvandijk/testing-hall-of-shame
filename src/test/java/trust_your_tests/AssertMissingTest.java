package trust_your_tests;

import org.junit.jupiter.api.Test;

class AssertMissingTest {

    @Test
    void aTestWithoutAssertions() {
        StringBuilder arrange = new StringBuilder("arrange");

        arrange.append("\n");
        arrange.append("act");

        // assert ?
    }
}
