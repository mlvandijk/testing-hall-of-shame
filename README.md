# testing-hall-of-shame

Some code examples of tests (or lack thereof) that I have come across.

**Note:** Mostly examples of what **NOT** to do.


1. Run your tests

2. In order for your tests to be useful, you have to run them.

I've found tests that had not been run for years (!) for any number of reasons.

Find the examples in package `run_your_tests`. Some are quite creative.

Note: If you absolutely HAVE to disable a test, use the proper annotation AND give a reason.

2. Never trust a test you haven't seen fail

Make sure that the tests you write fail for the reasons you expect them to fail.

Otherwise, how can you hope to catch those failures in the future?

Find some examples in package `trust_your_tests`

3. A failing test should tell you exactly what's wrong quickly

Analysing test failures takes time. 
You want to limit that time by having tests that clearly and quickly tell you what the problem is, so you can get on with fixing it.

Find some examples of tests that do not provide clear information when failing in package `failures`.
