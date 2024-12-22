
package JAVACourse;


/**
 * The _29_Inheritance class demonstrates the concept of inheritance in Java
 * by utilizing the properties and methods of the _29_Calc class.
 * <p>
 * This class defines a simple example where an object of the _29_Calc class
 * is created and used to perform basic arithmetic operations such as addition
 * and subtraction. The results of the operations are printed to the console.
 * <p>
 * This example illustrates how to create and utilize an instance of a class
 * and shows the utilization of parent class methods in a derived context.
 */
public class _29_Inheritance {
    public static void main(String[] args) {
        _29_Calc obj = new _29_Calc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(6, 5);
        System.out.println(r1 + "  " + r2);
    }
}
