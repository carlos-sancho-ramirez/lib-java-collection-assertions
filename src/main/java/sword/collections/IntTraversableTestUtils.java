package sword.collections;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static sword.collections.SizableTestUtils.assertSize;

public final class IntTraversableTestUtils {

    public static int getSingleValue(IntTraversable traversable) {
        assertSize(1, traversable);
        return traversable.valueAt(0);
    }

    public static void assertContains(int expected, IntTraversable traversable) {
        if (!traversable.contains(expected)) {
            fail("Value " + expected + " not contained in the collection");
        }
    }

    public static void assertNotContains(int notExpected, IntTraversable traversable) {
        if (traversable.contains(notExpected)) {
            fail("Value " + notExpected + " is contained in the collection");
        }
    }

    public static void assertContainsOnly(int expectedValue, IntTraversable actual) {
        final int actualValue = getSingleValue(actual);
        if (expectedValue != actualValue) {
            fail("Single value in the collection was expected to be " + expectedValue + ", but it was " + actualValue);
        }
    }

    public static void assertContainsOnly(int value1, int value2, IntTraversable actual) {
        assertNotEquals(value1, value2);
        assertSize(2, actual);
        assertContains(value1, actual);
        assertContains(value2, actual);
    }

    public static void assertContainsOnly(int value1, int value2, int value3, IntTraversable actual) {
        assertNotEquals(value1, value2);
        assertNotEquals(value1, value3);
        assertNotEquals(value2, value3);
        assertSize(3, actual);
        assertContains(value1, actual);
        assertContains(value2, actual);
        assertContains(value3, actual);
    }

    private IntTraversableTestUtils() {
    }
}
