package JAVACourse;

/**
 * The _37_WrapperClass class demonstrates the use of wrapper classes in Java.
 * Wrapper classes provide a way to use primitive data types (such as int, double, etc.)
 * as objects and include utility methods for converting between primitives and objects.
 * <p>
 * This class highlights the following concepts:
 * - Boxing: Manual conversion of a primitive value (e.g., int) into its corresponding
 * wrapper class object (e.g., Integer).
 * - Auto-boxing: Automatic conversion of a primitive value into its wrapper class object.
 * - Unboxing: Manual conversion of a wrapper class object back to its corresponding
 * primitive value.
 * - Auto-unboxing: Automatic conversion of a wrapper class object to its primitive value.
 * <p>
 * The class utilizes these concepts to demonstrate how primitive types and wrapper
 * classes interact seamlessly in Java. It enhances understanding of the flexibility
 * offered by wrapper classes when working with Java collections and methods
 * that require object parameters.
 */
public class _37_WrapperClass {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = new Integer(num);  //Boxing
        Integer obj1 = num;  //auto-Boxing


        num = obj.intValue();//unboxing
        num = obj;//Auto-unboxing

        System.out.println(obj);
    }
}
