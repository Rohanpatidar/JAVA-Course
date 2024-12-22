//package JAVACourse;
//
//class Counter {
//    public int count;
//
//    public void increment() {
//        count++;
/// /        System.out.println("in increament " + count);
//    }
//}
//
//
//public class _60_RaceCondition {
//    public static void main(String[] args) throws InterruptedException {
//        Counter nano = new Counter();
//
//
//        Runnable oppo = () ->
//        {
//            for (int i = 0; i < 1000; i++) {
//                nano.increment();
/// /                System.out.println("In oppo");
//            }
//
//        };
//        Runnable vivo = () ->
//        {
//            for (int i = 0; i < 1000; i++) {
//                nano.increment();
/// /                System.out.println("In vivo");
//            }
//
//        };
//        Thread t1 = new Thread(oppo);
//        Thread t2 = new Thread(vivo);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//
//        System.out.println("Count = " + nano.count);
//
//
//    }
//}


//If we run one thread at onoe time then use synchronized keyword


package JAVACourse;

/**
 * The Counter class provides a simple mechanism for counting with thread safety.
 * It includes functionality to increment the counter in a synchronized manner,
 * ensuring atomicity and preventing race conditions in multithreaded environments.
 */
class Counter {
    public int count;

    public synchronized void increment() {
        count++;
//        System.out.println("in increament " + count);
    }
}


/**
 * The _60_RaceCondition class demonstrates a race condition scenario in a multithreaded
 * environment. A race condition occurs when multiple threads access and modify shared
 * data concurrently without proper synchronization, leading to unpredictable results.
 *
 * This class employs two threads to increment a shared counter variable via the Counter
 * class. The Counter class uses the `synchronized` keyword to ensure thread-safe
 * operations on the shared counter. However, this example illustrates the importance of
 * synchronization in preventing race conditions.
 *
 * Key features:
 * - Creates a shared Counter object, which maintains a synchronized increment method.
 * - Spawns two threads (`oppo` and `vivo`) that increment the shared counter.
 * - Demonstrates proper use of `start()` and `join()` methods to handle thread execution.
 * - Shows the final value of the counter after both threads have completed their execution.
 *
 * This class helps in understanding the concept of thread safety and the risks associated
 * with concurrent access to shared resources.
 */
public class _60_RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter nano = new Counter();


        Runnable oppo = () ->
        {
            for (int i = 0; i < 1000; i++) {
                nano.increment();
//                System.out.println("In oppo");
            }

        };
        Runnable vivo = () ->
        {
            for (int i = 0; i < 1000; i++) {
                nano.increment();
//                System.out.println("In vivo");
            }

        };
        Thread t1 = new Thread(oppo);
        Thread t2 = new Thread(vivo);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("Count = " + nano.count);


    }
}
