package sword.collections;

import static org.junit.jupiter.api.Assertions.fail;
import static sword.collections.EqualUtils.equal;
import static sword.collections.SizableTestUtils.assertSize;

public final class TraversableTestUtils {

    public static <E> E getSingleValue(Traversable<E> traversable) {
        assertSize(1, traversable);
        return traversable.valueAt(0);
    }

    public static <E> void assertContainsOnly(E expectedValue, Traversable<E> actual) {
        final E actualValue = getSingleValue(actual);
        if (!equal(expectedValue, actualValue)) {
            fail("Single value in the collection was expected to be " + expectedValue + ", but it was " + actualValue);
        }
    }

    private TraversableTestUtils() {
    }
}
