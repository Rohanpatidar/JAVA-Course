package JAVACourse;

/**
 * The Example11 class is an abstract class that provides a blueprint for creating concrete implementations.
 * It contains an abstract method that must be overridden by any subclass.
 * <p>
 * Abstract Methods:
 * - show(): An abstract method that must be implemented by subclasses to define specific actions or behaviors.
 * <p>
 * This class serves as a foundation for creating classes with a common interface while allowing them to
 * define customized implementations for the abstract method.
 */
abstract class Example11 {
    public abstract void show();
}

/**
 * The _40_AbstractAndAnonymousInnerClass class demonstrates the use of
 * anonymous inner classes in Java.
 * <p>
 * Anonymous inner classes are used here to define and instantiate an abstract class
 * without using a separate named subclass. This allows for inline implementation
 * of the abstract methods in a concise manner.
 * <p>
 * Key concepts showcased in this class include:
 * - Creating an instance of an abstract class through an anonymous block.
 * - Overriding an abstract method directly within the anonymous inner class.
 * - Executing the overridden method.
 * <p>
 * This class highlights the use of anonymous inner classes as a quick
 * and flexible way to provide specific implementations for abstract classes or
 * interfaces in scenarios where a full implementation class is unnecessary.
 */
public class _40_AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {

        Example11 obj = new Example11() {
            @Override
            public void show() {
                System.out.println("Hello World");
            }
        };
        obj.show();

    }
}
