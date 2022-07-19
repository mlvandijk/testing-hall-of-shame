package run_your_tests;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class IgnoreTest {

    /* Don't do this
    * 1. This test doesn't run
    * 2. @Ignore is JUnit 4, which is old
    */
    @Ignore
    @Test
    public void testSomething() {
        // your test code here
    }

}
