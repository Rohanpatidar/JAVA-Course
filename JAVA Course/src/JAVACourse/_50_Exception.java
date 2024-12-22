package JAVACourse;
//************Three Types of Error************
//Compile Time Error
//Logical Error
//Run Time Error(Exception)

import java.sql.SQLOutput;

/**
 * The _50_Exception class demonstrates the handling of exceptions in Java.
 * It showcases the use of try-catch blocks to manage various types of exceptions
 * such as ArithmeticException, ArrayIndexOutOfBoundsException, and general Exceptions.
 * <p>
 * Key functionalities highlighted in this class include:
 * - Identifying and handling critical statements that may throw exceptions.
 * - Using multiple catch blocks to handle specific exception types.
 * - Implementing a generic catch block for handling exceptions of indeterminate type.
 * - Utilizing a finally block to ensure execution of statements irrespective of errors in the try block.
 * <p>
 * This class serves as an example of structured error handling, emphasizing
 * the importance of managing runtime exceptions for robust and error-free applications.
 */
//Exception are Handling with the help of Try And Catch
public class _50_Exception {
    public static void main(String[] args) {
        int i = 2;
        int f = 0;
        String str = null;
        int nums[] = new int[5];
//        int j = 8 / i;//Critical Statement
//        System.out.println(j); //Arithmatic error

        //Handle Error
//
//        try {
//            f = 18 / i;
//            System.out.println(nums[1]);
//            System.out.println(nums[5]);
//
//        } catch (Exception e) {
//            System.out.println("Something Wrong " + " : " + e);
//        }
        try {
            f = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        } catch (ArithmeticException e) {
            System.out.println("Something Wrong " + " : " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something Wrong " + " : " + e);

        } catch (Exception e) {
            System.out.println("Something Wrong " + " : " + e);
        }


        try {
            int k = 8 / i;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error" + " : " + e);
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println(i);
    }
}
