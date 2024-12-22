package JAVACourse;

/**
 * Represents a functional interface with a single abstract method to be used in
 * lambda expressions or method references for performing operations with integer input.
 * <p>
 * This interface is designed for functional programming constructs where an operation
 * is applied to an integer parameter without returning a value.
 * <p>
 * As a functional interface, this interface can be implemented using a lambda expression
 * or a method reference adhering to its functional method signature.
 */
@FunctionalInterface
interface Example16 {
    void show(int i);
}

/**
 * The _48_LamdaExpression class demonstrates the use of lambda expressions in Java.
 * Lambda expressions are used to provide a concise way to represent anonymous
 * functions or methods with a single method interface (functional interface).
 * <p>
 * In this example:
 * - A functional interface named `Example16` is utilized.
 * - Various forms of lambda expressions are presented for implementation of the
 * `show(int i)` method specified in the functional interface.
 * - The lambda expressions highlight type inference, optional parentheses for single
 * parameters, and simplified syntax for functional programming.
 * <p>
 * This class illustrates the basic syntax and usage of lambda expressions to
 * implement functional interfaces in a more readable and compact manner.
 */
public class _48_LamdaExpression {
    public static void main(String[] args) {
//        Example16 obj = (int i) -> System.out.println("Hello World!");
//        Example16 obj = ( i) -> System.out.println("Hello World!");
        Example16 obj = i -> System.out.println("Hello World!");
//this all are correct
        obj.show(2);
    }
}
//it is only use for
//functional Interface