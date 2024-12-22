package JAVACourse;

/**
 * The _20_StringClass class demonstrates basic String manipulations in Java.
 * It showcases the following concepts and methods of the String class:
 * <p>
 * - String Object Creation: Demonstrates the creation of a String object using the `new` keyword.
 * - Concatenation: Uses the `+` operator and `concat()` method to combine strings.
 * - Character Access: Retrieves a character at a specific index using the `charAt()` method.
 * - Hash Code: Displays the hash code of the string using the `hashCode()` method.
 * <p>
 * This class highlights fundamental operations on String objects for understanding String manipulations.
 */
public class _20_StringClass {
    public static void main(String[] args) {
        String name = new String("Rohan");
        System.out.println("Hello " + name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Patidar"));
    }
}
