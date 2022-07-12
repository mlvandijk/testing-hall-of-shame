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

    /* If you HAVE to Disable a test:
     * 1. Do you really? Preferably fix the test, fix the bug it found, or delete it if no longer useful.
     * 2. @Ignore was replaced with @Disabled in JUnit 5
     * 3. Add a REASON why you are ignoring this test
     */
    @Disabled("Reason this test is disabled")
    @Test
    public void testSomethingSlightlyBetter() {
        // your test code here
    }
}
