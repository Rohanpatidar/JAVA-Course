package JAVACourse;

/**
 * The Example5 class serves as a base class to demonstrate method overriding
 * and custom methods in Java.
 * <p>
 * This class includes the following features:
 * - A method `show` that can be overridden in subclasses.
 * - A method `displayMessage` that prints a custom message.
 * <p>
 * Subclasses inheriting from Example5 can override the `show` method to
 * implement their specific behavior while also leveraging methods from this class.
 */
class Example5 {
    public void show() {
        System.out.println("In B Show");
    }

    public void displayMessage() {
        System.out.println("This is a custom message from Example5.");
    }
}


/**
 * The Example6 class extends the functionality of the Example5 class.
 * It overrides the `show` method to provide a custom implementation.
 * <p>
 * This class demonstrates method overriding in Java, where a subclass
 * redefines a method of its superclass to provide specialized behavior.
 */
class Example6 extends Example5 {
    public void show() {
        System.out.println("In A Show");
    }
}

/**
 * The _36_UpcastingAndDowncasting class demonstrates the concepts of upcasting and downcasting in Java.
 * <p>
 * Upcasting:
 * - Refers to the process of assigning a subclass object to a superclass reference.
 * - This allows access only to the methods defined in the superclass, even if the subclass overrides them.
 * <p>
 * Downcasting:
 * - Refers to the process of casting a superclass reference back to a subclass reference.
 * - This must be explicitly performed and is typically used to access subclass-specific members or overridden methods.
 * <p>
 * Key Points:
 * - Upcasting is implicit, whereas downcasting requires explicit casting.
 * - During upcasting, the method calls depend on the overridden implementation in the subclass, if applicable.
 */
public class _36_UpcastingAndDowncasting {
    public static void main(String[] args) {
        //Upcasting
        Example5 obj = new Example6();
        obj.show();
        //Downcasting
        Example6 obj2 = (Example6) obj;

    }

}


