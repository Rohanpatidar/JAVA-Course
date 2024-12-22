package JAVACourse;

/**
 * The X class provides a representation of a base class with two constructors.
 * It serves as a simple illustration of constructor overloading through parameterized
 * and non-parameterized constructors.
 * <p>
 * The key functionalities include:
 * - A default constructor that prints a message indicating its invocation.
 * - A parameterized constructor that accepts an integer value and prints a message,
 * demonstrating constructor overloading.
 */
class X {


    public X() {
        super();
        System.out.println("In X");
    }

    public X(int n) {
        super();
        System.out.println("In X in n");
    }
}

/**
 * The Y class provides a concrete implementation that extends the functionality of the X class.
 * It includes constructors that allow for default instantiation or instantiation with an integer parameter.
 * <p>
 * Features of this class:
 * - Invokes the corresponding constructors of the superclass X.
 * - Outputs specific messages indicating the flow of constructor invocation during object creation.
 */
class Y extends X {
    public Y() {
        super();
        System.out.println("In Y");
    }

    public Y(int n) {
        super(n);
        System.out.println("In y In n");
    }
}


/**
 * The _31_ThisAndSuper class demonstrates the use of `this` and `super` keywords
 * in Java, particularly in the context of class inheritance.
 * <p>
 * The main method of this class highlights:
 * <p>
 * - How constructors of a superclass and subclass are invoked using `super`.
 * - How overloading constructors in the subclass can allow various initialization mechanisms.
 * <p>
 * This class interacts with class `Y`, which extends class `X`.
 * The `super` keyword is used in class `Y` to explicitly call the constructor of the superclass `X`.
 */
public class _31_ThisAndSuper {
    public static void main(String[] args) {
//        Y obj = new Y();// This Call both constructor
        Y obj2 = new Y(3);
//        X obj1 = new X();

    }
}
//super method call constructor of super class
//this method call constructor of same class
