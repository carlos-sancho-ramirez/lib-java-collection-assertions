package sword.collections;

public final class EqualUtils {

    private EqualUtils() {
    }

    public static boolean equal(Object a, Object b) {
        return a == b || a != null && a.equals(b);
    }

    public static boolean isNull(Object reference) {
        return reference == null;
    }
}
