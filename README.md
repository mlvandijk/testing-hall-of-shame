# testing-hall-of-shame

Some code examples of tests (or lack thereof) that I have come across.

**Note:** Mostly examples of what **NOT** to do.


1. Run your tests
In order for your tests to be useful, you have to run them.

I've found tests that had not been run for years (!) for any number of reasons.

Find the examples in package `run_your_tests`. Some are quite creative.

Note: If you absolutely HAVE to disable a test, use the proper annotation AND give a reason.

2. Never trust a test you haven't seen fail
Make sure that the tests you write fail for the reasons you expect them to fail.

Otherwise, how can you hope to catch those failures in the future?


