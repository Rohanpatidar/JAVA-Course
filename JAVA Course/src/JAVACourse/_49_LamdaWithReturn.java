package JAVACourse;

/**
 * The Example17 interface defines a contract for performing a basic addition operation.
 * Classes implementing this interface need to provide a concrete implementation
 * of the `add` method, which takes two integer arguments and returns their sum.
 */
interface Example17 {
    int add(int a, int b);
}

/**
 * The _49_LamdaWithReturn class demonstrates the usage of lambda expressions and anonymous inner classes in Java.
 * It highlights how a functional interface can be implemented using both approaches.
 * <p>
 * Key concepts showcased in this class include:
 * - Creating an anonymous inner class to implement a functional interface.
 * - Using the `add` method from the Example17 interface to perform a simple addition operation.
 * <p>
 * This class focuses on demonstrating the versatility of functional interfaces and different ways to implement them.
 */
public class _49_LamdaWithReturn {
    public static void main(String[] args) {
        Example17 example = new Example17() {
            public int add(int a, int b) {
                return a + b;
            }
        };
//        Example17 example = ( a,b) -> a + b;
//        Example17 example = (int a, int b) -> {
//            return a + b;
//        };
        System.out.println(example.add(10, 20));
    }
}
