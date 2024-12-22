package JAVACourse;

/**
 * The _29_AdvCalc class extends the functionality of the _29_Calc class
 * by introducing additional mathematical operations.
 * <p>
 * This class provides methods to perform the following operations:
 * - Multiplication of two integers.
 * - Division of two integers.
 * <p>
 * The _29_AdvCalc class inherits the addition and subtraction methods from its superclass.
 */
public class _29_AdvCalc extends _29_Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}
 