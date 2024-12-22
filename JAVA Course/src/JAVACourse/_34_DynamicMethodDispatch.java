package JAVACourse;

/**
 * The Example1 class serves as a demonstration of a basic method implementation.
 * It includes a single method to display a message on the console.
 * <p>
 * This class is intended to be extended or used for showcasing method overriding
 * and basic inheritance concepts in Java.
 */
class Example1 {
    public void show() {
        System.out.println("In a Show");
    }
}

/**
 * The Example2 class is a subclass of Example1.
 * It overrides the show method from its superclass.
 * <p>
 * This implementation provides a specific behavior for
 * the show method, displaying a unique message to the console.
 */
class Example2 extends Example1 {
    @Override
    public void show() {
        System.out.println("IN B show");
    }

//    public static void main(String[] args) {
//
//        Example2 obj = new Example2();
//        obj.show();
//    }

}

/**
 * The _34_DynamicMethodDispatch class demonstrates the concept of dynamic method dispatch in Java.
 * Dynamic method dispatch, also known as runtime polymorphism, is a mechanism by which a call to an
 * overridden method is resolved at runtime rather than compile time. It allows a parent class reference
 * to refer to a child class object and invokes the overridden method in the child class.
 * <p>
 * This class contains an example implementation where a child class object is assigned to a parent class
 * reference, and the overridden method in the child class is called dynamically at runtime.
 */
public class _34_DynamicMethodDispatch {
    public static void main(String[] args) {
        //Type as Parent Object  can be of child
        Example1 obj = new Example1();
        obj.show();
    }
}

