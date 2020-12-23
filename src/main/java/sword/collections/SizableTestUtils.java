package sword.collections;

import static org.junit.jupiter.api.Assertions.fail;

public final class SizableTestUtils {

    public static void assertSize(int expectedSize, Sizable sizable) {
        final int actualSize = sizable.size();
        if (actualSize != expectedSize) {
            fail("Expected size is " + expectedSize + ", but it is actually " + actualSize);
        }
    }

    public static void assertEmpty(Sizable sizable) {
        if (!sizable.isEmpty()) {
            fail("Expected an empty collection, but had size " + sizable.size());
        }
    }

    private SizableTestUtils() {
    }
}
