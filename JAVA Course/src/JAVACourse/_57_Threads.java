package JAVACourse;

/**
 * The w class extends the Thread class and demonstrates the basic usage
 * of multithreading in Java by overriding the run method.
 * <p>
 * In the overridden run method, the thread executes a loop that outputs
 * the string "HII !" to the console 10 times.
 * <p>
 * This class serves as a simple example of creating and starting a thread
 * by extending the Thread class and defining the desired behavior in the run method.
 */
class w extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HII !");

        }
    }
}

/**
 * The V class is a custom thread implementation that extends the Thread class.
 * It overrides the run method to execute a specific task when the thread is started.
 * <p>
 * This class demonstrates the following concepts:
 * - Creating a custom thread by extending the Thread class.
 * - Overriding the run method to define the thread's task.
 * - Implementing a simple loop that outputs a predefined message to the console.
 * <p>
 * Key functionality:
 * - When the thread executes, it prints "HELLO !" to the console ten times.
 */
class V extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HELLO !");

        }

    }
}


/**
 * The _57_Threads class demonstrates the creation and execution of multiple threads
 * in Java by extending the Thread class.
 * <p>
 * This class starts two separate threads: one using the `V` class and the other
 * using the `w` class. Each thread runs its `run` method concurrently, allowing
 * them to execute their respective tasks independently.
 * <p>
 * Key concepts demonstrated in this class include:
 * - Creating custom threads by extending the `Thread` class.
 * - Overriding the `run` method to define the task to be executed by each thread.
 * - Starting threads using the `start` method.
 * <p>
 * This class highlights the basics of multithreading and concurrent execution in Java.
 */
public class _57_Threads {
    public static void main(String[] args) {
        V obj = new V();
        w obj1 = new w();

        obj1.start();
        obj.start();


    }
}
