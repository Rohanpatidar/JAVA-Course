//package JAVACourse;
//
//
//
//
//class T implements Runnable {
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("HII !");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//
//class O implements Runnable {
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("HELLO !");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
//}
//
//
//public class _59_Runnable {
//    public static void main(String[] args) {
//        T obj = new T();
//        O obj1 = new O();
//        Thread t1 = new Thread(obj);
//        Thread t2 = new Thread(obj1);
//
//        t1.start();
//
//        t2.start();
//
//
//    }
//}
//
//
/// /Due to multiple Inheritance is not possible
/// / in java runnable are comes
//
/// /We not extend p with thread


package JAVACourse;


/**
 * The _59_Runnable class demonstrates the use of Java's Runnable interface
 * and multithreading using the Thread class.
 * <p>
 * This class instantiates two Runnable objects, each representing a task
 * that outputs messages to the console with a short delay between each output.
 * Runnable objects are passed to Thread objects, which are then started
 * to execute the tasks concurrently.
 * <p>
 * Key concepts demonstrated in this class include:
 * - Creating Runnable objects using lambda expressions.
 * - Using a for loop within a Runnable task to execute repeated actions.
 * - Introducing a delay between actions using Thread.sleep().
 * - Handling potential InterruptedException that may be thrown by Thread.sleep().
 * - Starting and running multiple threads concurrently using the Thread class.
 * <p>
 * The class illustrates the basics of creating concurrent tasks in Java
 * and highlights the ability to run multiple threads simultaneously.
 */
public class _59_Runnable {
    public static void main(String[] args) {
        Runnable obj = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("HII !");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("HELLO !");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();

        t2.start();


    }
}


//Due to multiple Inheritance is not possible
// in java runnable are comes

//We not extend p with thread