package JAVACourse;

//Final=Method , Variable , Class

/**
 * The Example3 class demonstrates simple methods for displaying a message
 * and performing an addition operation.
 * <p>
 * This class includes the following methods:
 * <p>
 * - `show()`: Outputs a predefined message to the console.
 * - `add(int a, int b)`: Takes two integer parameters, adds them, and
 * prints their sum to the console.
 * <p>
 * This class serves as a basic example for method implementation and usage.
 */
final class Example3 {
    public final void show() {
        System.out.println("In Example 3");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}


//class Example4 extends Example3 {
//    public void show() {
//        System.out.println("In Example 3");
//    }
//
//    public void add(int a, int b) {
//        System.out.println(a + b);
//    }
//}

/**
 * The _35_FinalKeyWord class demonstrates the usage of the `final` keyword in Java.
 * <p>
 * Key concepts include:
 * - Declaring a variable as `final`, which makes it a constant and prevents reassignment.
 * - Using `final` with methods to prevent method overriding.
 * - Using `final` with classes to prevent inheritance.
 * <p>
 * This class highlights the following:
 * - A `final` variable `num` is initialized and cannot be reassigned a new value.
 * - An instance of the `final` class `Example3` is created and its methods are invoked.
 * - The `final` method `show` in the `Example3` class cannot be overridden.
 * <p>
 * The application demonstrates the immutability and non-overriding characteristics
 * enforced by the `final` keyword in Java.
 */
public class _35_FinalKeyWord {
    public static void main(String[] args) {
        final int num = 8;
//        num=9;

//        System.out.println(num);

        Example3 obj = new Example3();
        obj.show();
        obj.add(3, 3);
    }
}
// Final variable for making Constant
// Final class protect our classes to inherit
// Final Method Stop method overRiding