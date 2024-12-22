package JAVACourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The _56_TryWithFinally class demonstrates the usage of `try-finally` and `try-with-resources`
 * constructs in Java for resource management and exception handling.
 * <p>
 * The class highlights the following concepts:
 * <p>
 * - Using `try-finally` to ensure cleanup of resources, such as closing a BufferedReader.
 * - Implementing `try-with-resources` to handle resources more concisely and automatically
 * close them after use, without requiring explicit `finally` blocks.
 * - Reading input from the user via a BufferedReader and parsing it into an integer.
 * - Proper handling of potential exceptions during resource usage.
 * <p>
 * The class serves as a practical example of resource management in Java and shows
 * the advantages of using `try-with-resources` for cleaner and more reliable code.
 */
public class _56_TryWithFinally {
    public static void main(String[] args) throws IOException {
        int i = 10;
//        try {
//            if (i == 10) {
//                throw new Exception("sorry");
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("finally");
//        }
        //mainly we use finally with try for resources
//        BufferedReader br = null;
//        try {
//            InputStreamReader in = new InputStreamReader(System.in);
//            br = new BufferedReader(in);
//            i = Integer.parseInt(br.readLine());
//            System.out.println(i);
//
//        } finally {
//            br.close();
//        }


        //try with resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            i = Integer.parseInt(br.readLine());
            System.out.println(i);
        }
    }
}
