package JAVACourse;

/**
 * The _15_Array class demonstrates the use of arrays in Java.
 * It showcases how to declare, initialize, and access elements of an array.
 * <p>
 * Key concepts showcased in this class include:
 * - Declaring an integer array and specifying its size.
 * - Assigning values to array elements using their index.
 * - Accessing and printing array elements using both direct index referencing
 * and iterating through the array elements with a for loop.
 * <p>
 * This class emphasizes the basics of array usage and iteration in Java.
 */
public class _15_Array {
    public static void main(String[] args) {

//                int num[] ={3,7,4,2};
//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
        int num[] = new int[4];
        num[0] = 3;
        num[1] = 4;
        num[2] = 5;
        num[3] = 7;
//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
        for (int i = 0; i < 4; i++) {
            System.out.println(num[i]);
        }


    }
}
