
package JAVACourse;

/**
 * The 'A' class is a demonstration class to highlight that Java does not support
 * multiple inheritance through classes. While Java allows a class to inherit
 * from a single parent class, it does not permit a class to inherit from more
 */
//Multiple Inheritance will not work in Java
class A {

}

/**
 * The B class serves as a placeholder for demonstrating class structure in Java.
 * It contains no methods, fields, or functionality currently defined.
 * <p>
 * This class can be extended or modified to include specific attributes and
 * methods as per the requirements of a given application.
 */
class B {

}

//class C extends A,B{
//
//}


/**
 * The _30_MultipleInheritance class demonstrates the concept of multiple inheritance
 * using a class hierarchy in which advanced features are built upon existing basic functionalities.
 * <p>
 * This class utilizes the _29_VeryAdvCalc class, which extends the capabilities of its superclass
 * to provide basic arithmetic operations (addition, subtraction, multiplication, division)
 * as well as advanced operations (power calculation).
 * <p>
 * The main method within this class illustrates the following:
 * - Instantiation of the _29_VeryAdvCalc class.
 * - Performing basic arithmetic operations (add, subtract, multiply, divide).
 * - Performing an advanced operation (power).
 * - Printing the results of these calculations to the console.
 * <p>
 * This example encapsulates the idea of reusability and extensibility in object-oriented programming.
 */
public class _30_MultipleInheritance {
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
