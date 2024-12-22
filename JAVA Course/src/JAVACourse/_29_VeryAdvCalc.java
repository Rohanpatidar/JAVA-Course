
package JAVACourse;

/**
 * The _29_VeryAdvCalc class extends the functionality of the _29_AdvCalc class
 * by adding advanced mathematical operations.
 * <p>
 * This class introduces the following functionality:
 * - Power operation: Calculates the result of raising one number to the power of another.
 * <p>
 * The _29_VeryAdvCalc class inherits addition, subtraction, multiplication,
 * and division operations from its superclass hierarchy.
 */
public class _29_VeryAdvCalc extends _29_AdvCalc {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}
