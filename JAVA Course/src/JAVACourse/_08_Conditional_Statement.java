package JAVACourse;

/**
 * The _08_Conditional_Statement class demonstrates the use of a basic conditional
 * if-else statement in Java. Conditional statements enable a program to make
 * decisions and execute certain blocks of code based on specific conditions.
 * <p>
 * In this example:
 * - An integer variable 'x' is initialized with a value.
 * - The `if` statement checks whether the value of 'x' is greater than 10.
 * - If the condition evaluates to true, a corresponding message is printed.
 * - If the condition evaluates to false, an alternative message is printed in the `else` block.
 * <p>
 * The purpose of this class is to illustrate the structure and functionality
 * of conditional control flow in Java programs.
 */
public class _08_Conditional_Statement {
    public static void main(String[] args) {
        int x = 8;
        if (x > 10) {
            System.out.println("bye");
        } else {
            System.out.println("Hello");
        }
    }
}
