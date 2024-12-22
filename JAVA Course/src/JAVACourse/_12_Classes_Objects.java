package JAVACourse;

/**
 * The Calculator class provides basic arithmetic operations.
 * It includes a method for performing addition of two integers.
 */
class Calculator {
    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

/**
 * The _12_Classes_Objects class demonstrates the basic usage of classes and objects in Java.
 * This class features an example of creating an object of another class, invoking a method,
 * and utilizing the returned value to perform computations.
 * <p>
 * The example involves:
 * - Declaring and initializing integer variables.
 * - Creating an instance of the Calculator class.
 * - Invoking the `add` method from the Calculator class to calculate the sum of two integers.
 * - Printing the result to the console.
 */
public class _12_Classes_Objects {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
//        int result=num1+num2;
        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);
        System.out.println(result);
        System.out.println(result);

    }
}
