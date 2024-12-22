//package JAVACourse;
//
//class Example9 {
//    public void show() {
//        System.out.println("In Example9");
//    }
//}
//
//class Example10 extends Example9 {
//    public void show() {
//        System.out.println("In Example10");
//    }
//}
//
//public class _39_AnonomyousInnerClass {
//    public static void main(String[] args) {
//        Example9 obj = new Example10();
//        obj.show();
//    }
//}
//Above code is makeing extra file  if we use not further more

package JAVACourse;

/**
 * The Example9 class demonstrates the definition of a simple class
 * with a single method, `show`, which outputs a message to the console.
 * <p>
 * This class can be extended or overridden to provide customized behavior
 * in its `show` method, allowing implementation of specific functionality
 * as needed.
 */
class Example9 {
    public void show() {
        System.out.println("In Example9");
    }
}


/**
 * The _39_AnonomyousInnerClass class demonstrates the use of anonymous inner classes in Java.
 * An anonymous inner class allows the creation of a subclass or implementation of an interface
 * without explicitly defining a separate subclass or implementation class.
 * <p>
 * This class creates an anonymous inner class based on the Example9 class. The `show` method of
 * Example9 is overridden within the anonymous inner class to provide a custom implementation.
 * <p>
 * Key concepts showcased in this class include:
 * - Creating an instance of an anonymous inner class.
 * - Overriding methods within the anonymous inner class.
 * - Invoking methods on an instance of an anonymous inner class.
 */
public class _39_AnonomyousInnerClass {
    public static void main(String[] args) {
        Example9 obj = new Example9() {
            @Override
            public void show() {
//                super.show();
                System.out.println("In Anonymous Inner Class");
            }
        };
        obj.show();
    }
}