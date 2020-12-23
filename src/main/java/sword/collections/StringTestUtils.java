package sword.collections;

import static org.junit.jupiter.api.Assertions.assertTrue;

public final class StringTestUtils {

    public static ImmutableIntRange rangeOf(String text, String segment) {
        final int start = text.indexOf(segment);
        assertTrue(start >= 0, "'" + segment + "' not found in text '" + text + '\'');

        final int end = start + segment.length();
        return new ImmutableIntRange(start, end - 1);
    }

    private StringTestUtils() {
    }
}
