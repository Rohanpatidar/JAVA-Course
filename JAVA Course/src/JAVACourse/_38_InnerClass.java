package JAVACourse;

/**
 * The Example7 class demonstrates a nested class structure in Java.
 * It contains a method to print a message to the console and an inner class
 * named Example8 with its own method for console output.
 * <p>
 * The key components of this class are:
 * - An outer class method `show()` that prints a message indicating it is
 * being called from Example7.
 * - A nested class Example8, which provides its own implementation of the
 * `show()` method, printing a message specific to Example8.
 * <p>
 * This class showcases the use of nested classes and method overriding
 * within the nested class context.
 */
class Example7 {
    public void show() {
        System.out.println("In Example7");
    }

    class Example8 {

        public void show() {
            System.out.println("In Example8");
        }
    }


}

/**
 * The _38_InnerClass class demonstrates the use of inner classes in Java.
 * It showcases how to define and utilize an inner class within an outer class,
 * and differentiate between static and non-static inner classes.
 * <p>
 * This class includes the following functionalities:
 * - Instantiating an outer class and invoking its method.
 * - Creating an object of a non-static inner class using an instance of the outer class.
 * - Accessing and invoking methods from both the outer and inner classes.
 * <p>
 * The primary objective of this class is to illustrate the interaction
 * between an outer class and its inner class and highlight their method accessibility.
 */
public class _38_InnerClass {
    public static void main(String[] args) {
        Example7 obj = new Example7();
        obj.show();
        //not static class use object
        Example7.Example8 obj2 = obj.new Example8();
        obj2.show();
    }
}
//if static then don't need making object
//Example7.Example8 obj2= new Example7.Example8();
//Only Inner class make static
//outer class not making static