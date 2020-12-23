package sword.collections;

import static org.junit.jupiter.api.Assertions.fail;
import static sword.collections.SizableTestUtils.assertSize;

public final class IntPairMapTestUtils {

    public static void assertSinglePair(int expectedKey, int expectedValue, IntPairMap map) {
        assertSize(1, map);
        final int actualKey = map.keyAt(0);
        if (expectedKey != actualKey) {
            fail("Single key in map was expected to be " + expectedKey + ", but it was " + actualKey);
        }

        final int actualValue = map.valueAt(0);
        if (expectedValue != actualValue) {
            fail("Single value in map was expected to be " + expectedValue + ", but it was " + actualValue);
        }
    }

    private IntPairMapTestUtils() {
    }
}
