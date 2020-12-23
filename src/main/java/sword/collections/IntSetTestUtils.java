package sword.collections;

import static org.junit.jupiter.api.Assertions.fail;

public final class IntSetTestUtils {

    public static void assertEqualSet(IntSet expected, IntSet actual) {
        if (!expected.equalSet(actual)) {
            fail("Sets do not match");
        }
    }

    public static ImmutableIntSet intSetOf(int... values) {
        final ImmutableIntSetCreator builder = new ImmutableIntSetCreator();
        for (int value : values) {
            builder.add(value);
        }
        return builder.build();
    }

    private IntSetTestUtils() {
    }
}
