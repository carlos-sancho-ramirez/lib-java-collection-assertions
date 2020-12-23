package sword.collections;

import static org.junit.jupiter.api.Assertions.fail;

public final class SetTestUtils {

    public static <T> void assertEqualSet(Set<T> expected, Set<T> actual) {
        if (!expected.equalSet(actual)) {
            fail("Sets do not match");
        }
    }

    private SetTestUtils() {
    }
}
