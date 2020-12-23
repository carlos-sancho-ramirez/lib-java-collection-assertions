package sword.collections;

import static org.junit.jupiter.api.Assertions.fail;
import static sword.collections.EqualUtils.equal;
import static sword.collections.SizableTestUtils.assertSize;

public final class MapTestUtils {

    public static <K, V> void assertSinglePair(K expectedKey, V expectedValue, Map<K, V> map) {
        assertSize(1, map);
        final K actualKey = map.keyAt(0);
        if (!equal(expectedKey, actualKey)) {
            fail("Single key in map was expected to be " + expectedKey + ", but it was " + actualKey);
        }

        final V actualValue = map.valueAt(0);
        if (!equal(expectedValue, actualValue)) {
            fail("Single value in map was expected to be " + expectedValue + ", but it was " + actualValue);
        }
    }

    public static <K, V> void assertEqualMap(Map<K, V> expected, Map<K, V> actual) {
        if (!expected.equalMap(actual)) {
            fail("Maps do not match");
        }
    }

    private MapTestUtils() {
    }
}
