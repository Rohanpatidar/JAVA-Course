package JAVACourse;

/**
 * The _17_JaggedArray class demonstrates the use of jagged arrays in Java.
 * A jagged array is an array of arrays where the inner arrays can have
 * different lengths, allowing for non-uniform data structures.
 * <p>
 * Key concepts showcased in this class include:
 * <p>
 * - Declaring a 2D array with varying sizes for inner arrays.
 * - Initializing jagged array elements with random integer values.
 * - Using nested loops to iterate through and populate the jagged array.
 * - Printing the elements of the jagged array using both traditional for-loops
 * and enhanced for-loops (for-each loops).
 * <p>
 * This class highlights how to create, populate, and access jagged arrays,
 * as well as demonstrates loop constructs to process array elements.
 */
public class _17_JaggedArray {
    public static void main(String[] args) {
        int num[][] = new int[3][]; //jagged

        num[0] = new int[3];
        num[1] = new int[4];
        num[2] = new int[2];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
