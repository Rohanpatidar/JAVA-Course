
package JAVACourse;

//Multilevel Innheritance


/**
 * The _29_InheritanceThree class demonstrates the concept of inheritance in Java.
 * It shows how multiple classes can inherit and extend functionality from their parent classes.
 * <p>
 * This class specifically highlights:
 * - Instantiation of an object of the _29_VeryAdvCalc class.
 * - Utilizing inherited and extended methods from the _29_VeryAdvCalc class, which
 * is derived from its parent classes (_29_AdvCalc and _29_Calc).
 * - Performing various arithmetic operations such as addition, subtraction,
 * multiplication, division, and power calculation using the respective methods.
 * - Printing the results of these operations.
 * <p>
 * This class illustrates the hierarchical structure and reuse of code through
 * inheritance, demonstrating how advanced functionalities can build upon
 * basic ones provided by parent classes.
 */
public class _29_InheritanceThree {

    public static void main(String[] args) {
        _29_VeryAdvCalc obj = new _29_VeryAdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(6, 5);
        int r3 = obj.multi(6, 5);
        int r4 = obj.div(15, 4);
        double r5 = obj.power(2, 3);

        System.out.println(r1 + "  " + r2 + " " + r3 + "  " + r4);
    }

}

