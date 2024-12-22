package JAVACourse;

/**
 * The _09_Ternary_Operator class demonstrates the use of the ternary operator in Java.
 * <p>
 * The ternary operator (?:) is a conditional operator that evaluates a boolean expression
 * and assigns a value based on the result. It follows the format:
 * <p>
 * condition ? valueIfTrue : valueIfFalse
 * <p>
 * This class contains an example where the ternary operator is used to check a condition
 * on an integer and assign a corresponding value based on whether the condition is true or false.
 * The result is then printed to the console.
 */
public class _09_Ternary_Operator {
    public static void main(String[] args) {
        int x = 10;
        int result;
        result = !(x % 2 == 0) ? 10 : 20;
        System.out.println(result);
    }
}
