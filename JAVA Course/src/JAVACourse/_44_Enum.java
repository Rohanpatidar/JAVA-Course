package JAVACourse;

/**
 * The Color1 enum represents a set of predefined color constants.
 * It defines three color constants: RED, GREEN, and BLUE.
 * <p>
 * Enums are a special type in Java that allow a variable to hold
 * a set of predefined constants, enhancing type safety and code clarity.
 * <p>
 * This enum can be utilized in scenarios where a finite and fixed set
 * of values is required, such as representing primary colors in an application.
 */
enum Color1 {
    RED, GREEN, BLUE;
}

/**
 * The _44_Enum class demonstrates the usage of enums and their application in control structures
 * such as switch-case statements and conditional constructs.
 * <p>
 * In this example, an enumeration named Color1 is utilized, which is defined with the constants:
 * RED, GREEN, and BLUE. The class highlights different implementations where enums can be used.
 * <p>
 * Key features demonstrated include:
 * - Using enums within a switch-case statement to execute specific logic based on the enum value.
 * - Comparing enum values using conditional (`if-else`) constructs to determine which constant
 * matches the current selection.
 * <p>
 * This class serves as an illustration of the versatility and type safety provided by enums in Java.
 */
public class _44_Enum {
    public static void main(String[] args) {
        Color1 color = Color1.GREEN;

        switch (color) {
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
        }


        if (color == Color1.RED) {
            System.out.println("Red");
        } else if (color == Color1.GREEN) {
            System.out.println("Green");
        } else if (color == Color1.BLUE) {
            System.out.println("Blue");
        }


    }
}
