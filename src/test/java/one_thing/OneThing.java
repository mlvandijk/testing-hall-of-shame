package one_thing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OneThingTest {

    /*
    * The test below tests multiple things in a row.
    */
    @Test
    void testsMultipleThingsInARow() {
        List<String> things = new ArrayList<String>();
        assertTrue(things.isEmpty());
        things.add("a string");
        assertEquals(1, things.size());
        things.clear();
        things.add("a different string");
        things.add("another string");
        assertEquals(2, things.size());
    }


    /*
     * Split the test into multiple individual tests.
     * 1. If they fail, they don't block testing the rest of the behavior.
     * 2. If they fail, you know exactly what fails
     * 3. Each test has a more meaningful name; together they provide an overview of intended behavior
     */
    @Test
    void emptyArrayShouldBeEmpty() {
        List<String> things = new ArrayList<String>();
        assertTrue(things.isEmpty());
    }

    @Test
    void arrayWithOneItemShouldHaveSize1() {
        List<String> things = new ArrayList<String>();
        things.add("a string");
        assertEquals(1, things.size());
    }

    @Test
    void arrayWithMultipleItemsShouldHaveSize2() {
        List<String> things = new ArrayList<String>();
        things.add("a different string");
        things.add("another string");
        assertEquals(2, things.size());
    }
}
