package trust_your_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WillNeverFailTest {

    @Test
    void aTestThatWillNeverFail() {
        assertTrue(true);
    }
}
