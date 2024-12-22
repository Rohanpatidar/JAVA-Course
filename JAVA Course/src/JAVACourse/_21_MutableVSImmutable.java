package JAVACourse;

/**
 * The _21_MutableVSImmutable class demonstrates the behavior of mutable and
 * immutable objects in Java, using strings as an example.
 * <p>
 * Key concepts showcased in this class include:
 * <p>
 * - Strings in Java are immutable, meaning any modification creates a new instance.
 * - The hashCode method is used to demonstrate the difference in memory references
 * when string values are altered.
 * - String pooling in Java and how it impacts memory efficiency is highlighted
 * through the use of the `==` operator to compare references.
 * <p>
 * This class emphasizes the immutability of strings, hashCode behavior,
 * and the concept of string interning.
 */
public class _21_MutableVSImmutable {
    public static void main(String[] args) {
        String name = "navin";
        System.out.println(name.hashCode());
        name = name + " reddy";
        System.out.println(name.hashCode());
        System.out.println("Hello " + name);

        String s1 = "Navin";
        System.out.println(s1.hashCode());
        String s2 = "Navin";
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
    }

}
