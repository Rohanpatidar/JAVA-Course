package JAVACourse;

/**
 * The Example12 interface defines a contract that includes a method for displaying information.
 * It also provides constant properties representing specific values for age and area.
 * <p>
 * This interface is meant to be implemented by classes that will provide a concrete implementation
 * of the `show` method, displaying required information as determined by the implementing class.
 * <p>
 * Key elements:
 * - `age`: A constant integer representing a fixed age value.
 * - `area`: A constant string representing a fixed area value.
 * - `show`: A method that must be implemented by any class implementing this interface.
 */
interface Example12 {
    int age = 21;
    String area = "Indore";

    void show();
}

/**
 * The Example13 class provides an implementation of the Example12 interface.
 * It overrides the `show` method from the interface to display a message.
 * <p>
 * This class demonstrates the use of the `implements` keyword to implement the methods
 * defined in an interface. Specifically, it provides the implementation for the `show` method,
 * which is invoked to print "In Show" to the console.
 */
class Example13 implements Example12 {
    @Override
    public void show() {
        System.out.println("In Show");
    }
}

/**
 * The _41_Interface class demonstrates the implementation and usage of interfaces in Java.
 * <p>
 * This class includes the following key concepts:
 * - Declaration of an interface Example12, which serves as a contract for implementing classes.
 * - Implementation of the Example12 interface by the Example13 class, providing concrete behavior for its methods.
 * - The use of polymorphism by referencing an implementing class (Example13) through an interface type (Example12).
 * - Accessing interface fields and demonstrating their static and final nature.
 * <p>
 * The Example12 interface includes the declaration of fields and an abstract method `show`.
 * The Example13 class provides the implementation for the `show` method defined in Example12.
 * <p>
 * The main method illustrates:
 * - Creating an instance of an implementing class using the interface type.
 * - Invoking the `show` method through the interface reference.
 * - Accessing the static final fields defined in the interface and the implementing class.
 */
public class _41_Interface {
    public static void main(String[] args) {
        Example12 obj = new Example13();
        obj.show();
        System.out.println(Example12.age);
        System.out.println(Example12.area);
        System.out.println(Example13.age);
        System.out.println(Example13.area);
    }
}

//If any of the abstract
//class have only  abstract
//method than use interface
// this is not class
// by default method are
// public abstract
//Interface is not Instantiate
//We declare variable but it by default final and static