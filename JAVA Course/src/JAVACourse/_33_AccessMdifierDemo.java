package JAVACourse;

/**
 * The _33_AccessMdifierDemo class demonstrates the use of access modifiers in Java.
 * <p>
 * This class interacts with the _33_AccessModifiers class to highlight the
 * visibility and access level of fields defined with various access modifiers.
 * <p>
 * In this case, it specifically showcases accessing a protected field
 * from another class within the same package.
 */
public class _33_AccessMdifierDemo {
    public static void main(String[] args) {
        _33_AccessModifiers obj = new _33_AccessModifiers();
        System.out.println(obj.marks);
    }
}
