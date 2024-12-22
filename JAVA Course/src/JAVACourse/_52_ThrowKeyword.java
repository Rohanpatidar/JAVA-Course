package JAVACourse;

/**
 * The _52_ThrowKeyword class illustrates the use of the `throw` keyword to manually
 * trigger an exception in Java. It demonstrates how to handle exceptions thrown
 * intentionally within a try-catch construct.
 * <p>
 * Key concepts highlighted in this class include:
 * - Using the `throw` statement to initiate an exception.
 * - Utilizing an `if` condition to determine when to throw an exception.
 * - Catching the thrown exception with a specified `catch` block.
 * - Accessing and printing the exception message using the exception object.
 * <p>
 * This class provides a basic example of exception handling by demonstrating
 * how specific conditions can be used to raise and manage exceptions during runtime.
 */
public class _52_ThrowKeyword {
    public static void main(String[] args) {
        int i = 12;
        try {
            if (i == 12) {
                throw new ArithmeticException("Error");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
