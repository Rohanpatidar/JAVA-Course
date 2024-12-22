package JAVACourse;

/**
 * The _11_Loops class demonstrates the use of different loop constructs in Java.
 * It includes examples of the following loop types:
 * <p>
 * - While loop: Executes a block of code as long as the specified condition is true.
 * - Do-While loop: Executes a block of code once, and then repeats as long as the condition is true.
 * - For loop: Executes a block of code for a specified number of iterations.
 * <p>
 * Each loop type is used to print specific messages to the console iteratively.
 */
public class _11_Loops {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            System.out.println("Hii i am While");
            x++;
        }
        int j = 1;
        do {
            System.out.println("Hii i am Do While");
            j++;
        } while (j < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hii i am for ");
        }
    }
}
