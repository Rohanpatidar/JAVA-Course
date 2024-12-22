package JAVACourse;

/**
 * The CalculatorOne class provides methods for performing addition operations.
 * This class demonstrates method overloading by providing multiple versions
 * of the `add` method with different parameter combinations.
 * <p>
 * Methods:
 * - add(int n1, int n2, int n3): Adds three integer numbers.
 * - add(int n1, int n2): Adds two integer numbers.
 * - add(double n1, int n2): Adds a double number and an integer number.
 */
class CalculatorOne {
    public int add(int n1, int n2, int n3) {
        int r = n1 + n2 + n3;
        return r;
    }

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }

    public double add(double n1, int n2) {
        double r = n1 + n2;
        return r;
    }

}

/**
 * The _14_Method_Overloading class demonstrates the concept of method overloading in Java.
 * Method overloading allows the creation of multiple methods with the same name
 * but with different parameter lists within the same class.
 * This class showcases invoking an overloaded method from the CalculatorOne class.
 * <p>
 * Key functionality includes:
 * - Instantiating the CalculatorOne class to perform addition operations.
 * - Using one of the overloaded add methods from the CalculatorOne class to add a double and an integer.
 * - Displaying the result of the addition operation.
 * <p>
 * This class highlights the flexibility and utility of method overloading in scenarios
 * where multiple operations with similar logic but differing parameter types or counts are required.
 */
public class _14_Method_Overloading {
    public static void main(String[] args) {
        CalculatorOne cal = new CalculatorOne();
        double r1 = cal.add(3.2, 5);
        System.out.println(r1);
    }
}
