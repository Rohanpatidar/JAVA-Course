package JAVACourse;

/**
 * Example14 is a functional interface with a single abstract method, `show`.
 * A functional interface is an interface that contains exactly one abstract method,
 * making it ideal for use with lambda expressions and method references in Java.
 * <p>
 * This interface can be implemented by any class or instantiated using lambdas or anonymous classes
 * to define the behavior of the `show` method. Functional interfaces are commonly used
 * in functional programming scenarios in Java.
 */
@FunctionalInterface
interface Example14 {
    void show();
}

//class Example15 implements Example14 {
//    @Override
//    public void show() {
//        System.out.println("Hello World!");
//    }
//}

/**
 * The _47_FunctionalInterface class demonstrates the implementation and usage of a functional interface in Java.
 * A functional interface in Java is an interface with a single abstract method, which makes it suitable for lambda expressions
 * or anonymous classes.
 * <p>
 * This class utilizes a functional interface named Example14 with a single abstract method `show`.
 * An anonymous class is created to provide an implementation for the `show` method, which is then invoked.
 * <p>
 * Key features demonstrated include:
 * - Creating an object of a functional interface using an anonymous class.
 * - Implementing the abstract method of the functional interface within the anonymous class.
 * - Calling the method defined by the functional interface to execute its behavior.
 * <p>
 * This example highlights the basics of functional interfaces and their implementation using anonymous classes in Java.
 */
public class _47_FunctionalInterface {
    public static void main(String[] args) {
//        Example15 obj = new Example15();
//        obj.show();
        Example14 obj = new Example14() {
            @Override
            public void show() {
                System.out.println("Hello World!");
            }
        };
        obj.show();
    }
}
