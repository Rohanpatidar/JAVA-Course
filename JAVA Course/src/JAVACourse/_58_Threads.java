package JAVACourse;

/**
 * The M class is a thread that extends the {@code Thread} class
 * and overrides the {@code run} method to perform a custom task.
 * <p>
 * This thread, when executed, prints a predefined message ("HII !")
 * multiple times (20 iterations) to the console. Between each iteration,
 * the thread sleeps for a specified duration (10 milliseconds), allowing
 * for controlled execution and simulation of a paused state.
 * <p>
 * Key features:
 * - Demonstrates the creation of a custom thread by extending the {@code Thread} class.
 * - Showcases usage of the {@code Thread.sleep} method for pausing execution.
 * - Handles interruptions during the sleep state with a try-catch block.
 * <p>
 * This class provides a basic understanding of threading and thread behavior
 * in Java.
 */
class M extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("HII !");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

/**
 * The N class extends the Thread class and demonstrates the creation of a custom thread.
 * It overrides the run method to perform a specific task.
 * <p>
 * The primary functionality of this class is:
 * - Printing the message "HELLO !" 20 times to the console.
 * - Pausing the thread for 10 milliseconds between each message.
 * <p>
 * Key Features:
 * - Overrides the run method from the Thread class to define the task executed by the thread.
 * - Utilizes the Thread.sleep method to introduce a delay between successive executions.
 * - Handles the InterruptedException which may be thrown during the execution of Thread.sleep.
 */
class N extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("HELLO !");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


/**
 * The _58_Threads class demonstrates the creation and execution of multithreading using
 * classes that extend the Thread class in Java. It showcases controlling the priority of
 * threads and the interaction between multiple running threads.
 * <p>
 * Key concepts demonstrated in this class include:
 * - Creation of custom threads by extending the Thread class (`M` and `N` classes).
 * - Setting thread priorities using `setPriority` method.
 * - Starting threads using the `start` method, allowing them to execute concurrently.
 * - Introducing delays in thread execution using the `Thread.sleep` method.
 * <p>
 * This class provides an example of managing concurrent execution of two threads
 * while demonstrating thread priorities and delays.
 */
public class _58_Threads {
    public static void main(String[] args) {
        M obj = new M();
        N obj1 = new N();
//        obj.setPriority(1);//lowest
//        obj.setPriority(10);//highest
        obj.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj.start();


    }
}
