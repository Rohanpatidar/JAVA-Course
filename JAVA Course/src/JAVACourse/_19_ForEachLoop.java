package JAVACourse;

/**
 * The _19_ForEachLoop class demonstrates the use of a for-each loop
 * to iterate over an array in Java.
 * <p>
 * Key functionality of this class includes:
 * - Declaring and initializing an integer array with predefined values.
 * - Using a for-each loop to iterate through each element of the array.
 * - Printing each element of the array to the console during iteration.
 * <p>
 * This class highlights the simplicity and readability of using the for-each loop
 * for traversing through arrays when direct access to the index is not required.
 */
public class _19_ForEachLoop {
    public static void main(String[] args) {
        int num[] = new int[4];
        num[0] = 3;
        num[1] = 4;
        num[2] = 5;
        num[3] = 7;

        for (int n : num) {
            System.out.println(n);
        }
    }
}
