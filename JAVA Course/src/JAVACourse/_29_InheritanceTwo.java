package JAVACourse;


/**
 * The _29_InheritanceTwo class demonstrates the use of inheritance in Java.
 * It illustrates how an object of a subclass can utilize methods
 * inherited from a superclass as well as its own methods.
 * <p>
 * This class uses the _29_AdvCalc class, which extends _29_Calc, to perform
 * a variety of mathematical operations including:
 * - Addition of two integers through the add method (inherited from _29_Calc).
 * - Subtraction of two integers through the sub method (inherited from _29_Calc).
 * - Multiplication of two integers through the multi method (defined in _29_AdvCalc).
 * - Division of two integers through the div method (defined in _29_AdvCalc).
 * <p>
 * The results of these operations are printed to the console to demonstrate
 * the functionality of the extended class methods and inheritance features.
 */
public class _29_InheritanceTwo {

    public static void main(String[] args) {
        _29_AdvCalc obj = new _29_AdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(6, 5);
        int r3 = obj.multi(6, 5);
        int r4 = obj.div(15, 4);

        System.out.println(r1 + "  " + r2 + " " + r3 + "  " + r4);
    }

}
