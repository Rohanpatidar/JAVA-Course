package JAVACourse;


/**
 * The _32_Calc class provides a basic implementation for arithmetic operations.
 * This class serves as a utility for performing calculations and supports the following operation:
 * <p>
 * - Addition of two integers.
 * <p>
 * Designed for simplicity, the _32_Calc class implements basic functionality
 * and can be extended for more advanced arithmetic features.
 */
class _32_Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

/**
 * The _32_AdvCalc class extends the functionality of the _32_Calc class.
 * It overrides the add method to provide a modified implementation
 * where 1 is added to the summation of two integers.
 */
class _32_AdvCalc extends _32_Calc {
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }
}

/**
 * The _32_MethodOverriding class demonstrates the concept of method overriding in Java.
 * Method overriding allows a subclass to provide a specific implementation of a method
 * that is already defined in its superclass or parent class.
 * <p>
 * In this class, the following key concepts are showcased:
 * - The use of a parent reference (_32_Calc) to hold a child object (_32_AdvCalc),
 * highlighting polymorphism.
 * - The add method is overridden in the child class (_32_AdvCalc) to alter its behavior,
 * demonstrating dynamic method dispatch.
 * - The parent class (_32_Calc) provides a basic implementation of the add method,
 * whereas the child class (_32_AdvCalc) provides a modified version.
 * <p>
 * The class includes a main method that showcases:
 * - Invoking methods through both parent and child references.
 * - Observing the behavior differences caused by overriding the method in the subclass.
 */
public class _32_MethodOverriding {
    public static void main(String[] args) {
        _32_Calc obj1 = new _32_AdvCalc();
        _32_AdvCalc obj = new _32_AdvCalc();
        int r1 = obj.add(4, 8);
        int r2 = obj1.add(4, 8);
        System.out.println(r1);
        System.out.println(r2);
    }
}
