package sword.collections;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static sword.collections.EqualUtils.equal;
import static sword.collections.SizableTestUtils.assertSize;

public final class TraversableTestUtils {

    public static <E> E getSingleValue(Traversable<E> traversable) {
        assertSize(1, traversable);
        return traversable.valueAt(0);
    }

    public static <E> void assertContains(E expected, Traversable<E> traversable) {
        if (!traversable.contains(expected)) {
            fail("Value " + expected + " not contained in the collection");
        }
    }

    public static <E> void assertContainsOnly(E expectedValue, Traversable<E> actual) {
        final E actualValue = getSingleValue(actual);
        if (!equal(expectedValue, actualValue)) {
            fail("Single value in the collection was expected to be " + expectedValue + ", but it was " + actualValue);
        }
    }

    public static <E> void assertContainsOnly(E expectedValue1, E expectedValue2, Traversable<E> actual) {
        assertNotEquals(expectedValue1, expectedValue2);
        assertSize(2, actual);
        assertContains(expectedValue1, actual);
        assertContains(expectedValue2, actual);
    }

    public static <E> void assertContainsOnly(E expectedValue1, E expectedValue2, E expectedValue3, Traversable<E> actual) {
        assertNotEquals(expectedValue1, expectedValue2);
        assertSize(3, actual);
        assertContains(expectedValue1, actual);
        assertContains(expectedValue2, actual);
        assertContains(expectedValue3, actual);
    }

    private TraversableTestUtils() {
    }
}
