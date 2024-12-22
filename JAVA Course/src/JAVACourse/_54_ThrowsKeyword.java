package JAVACourse;
//class Z{
//    public void show(){
//        try {
//            Class.forName("Calc");
//
//            } catch (ClassNotFoundException e) {
//            System.out.println("not found");
//        }
//
//    }
//}


/**
 * The Z class contains a single method `show` that demonstrates the use
 * of the `Class.forName` method to dynamically load a class at runtime.
 * <p>
 * This method attempts to load a class with the name "Calc". If the class
 * cannot be found, a `ClassNotFoundException` will be thrown.
 * <p>
 * The `Class.forName` method is used for loading a class by its fully
 * qualified name and can be particularly useful in scenarios such as
 * dynamic class loading, reflection, and working with JDBC drivers.
 */
class Z {
    public void show() throws ClassNotFoundException {

        Class.forName("Calc");


    }
}

/**
 * The _54_ThrowsKeyword class demonstrates the use of the `throws` keyword in Java
 * to declare exceptions that a method might throw.
 * <p>
 * The main method creates an instance of the `Z` class and calls its `show` method.
 * The `show` method in the `Z` class uses the `Class.forName()` method, which can throw
 * a `ClassNotFoundException`.
 * <p>
 * In this class, the exception is handled using a try-catch block. When the `ClassNotFoundException`
 * is caught, it is rethrown as a `RuntimeException`.
 * <p>
 * This class exemplifies exception handling strategies, focusing on:
 * - Declaring exceptions with the `throws` keyword.
 * - Catching and rethrowing exceptions for customized handling.
 */
public class _54_ThrowsKeyword {
//    public static void main(String[] args) throws ClassNotFoundException
//    {
//        Z obj = new Z();
//        obj.show();
//    }


    public static void main(String[] args) {
        Z obj = new Z();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
