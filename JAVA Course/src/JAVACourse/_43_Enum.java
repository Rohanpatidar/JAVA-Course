package JAVACourse;

/**
 * The Color enum represents a collection of primary colors.
 * It defines three constants that correspond to basic colors: RED, GREEN, and BLUE.
 * <p>
 * Enums in Java are a special type of class used to define collections of constants.
 * The Color enum can be used to specify or reference a particular color in a type-safe manner.
 */
//Enum are constant
enum Color {
    RED, GREEN, BLUE;
}

/**
 * The _43_Enum class demonstrates the usage of Java Enums.
 * <p>
 * This class utilizes an enumeration `Color` with pre-defined constant values: RED, GREEN, and BLUE.
 * Key functionalities showcased include:
 * <p>
 * - Using the `values` method to retrieve all constants of the Enum.
 * - Accessing a specific constant of the Enum directly.
 * - Iterating through the array of Enum constants and printing their names and ordinal values.
 * <p>
 * Enums provide type safety and are used to define a fixed set of constants.
 */
public class _43_Enum {
    public static void main(String[] args) {
        Color color1 = Color.RED;
        Color[] color = Color.values();
        System.out.println(color1);
        for (Color c : color) {
            System.out.println(c + " : " + c.ordinal());
        }
    }
}
