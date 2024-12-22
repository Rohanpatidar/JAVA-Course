package JAVACourse;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * The _55_UserInput class demonstrates three different ways to accept user input in a Java program.
 * It highlights the use of various classes and methods for reading user input
 * from the console and processes the data accordingly.
 * <p>
 * Key features and methods demonstrated in this class include:
 * <p>
 * 1. Using `System.in.read()`:
 * - Reads a single byte of input from the user.
 * - Converts the input into an ASCII value.
 * - Limitation: Suitable for reading a single character's ASCII code, but not a full integer or long value.
 * <p>
 * 2. Using `BufferedReader` and `InputStreamReader`:
 * - Demonstrates the ability to read a full line of input and then parse it into an integer.
 * - Uses the `readLine()` method from the `BufferedReader` class.
 * - Highlights the capability to read input from various sources like files or databases.
 * - Requires handling of `IOException` for input operations.
 * <p>
 * 3. Using `Scanner`:
 * - Easiest and most popular method for user input in Java.
 * - Provides methods such as `nextInt()` to directly read integers.
 * - Demonstrates how to read and process numerical user input from the console.
 * - Ensures the `Scanner` object is properly closed after use.
 */
public class _55_UserInput {
    public static void main(String[] args) {
        //First Method
//**************************************************
/*        System.out.println("Enter a Number ");
        try {
            int num = System.in.read();
            System.out.println(num);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/
        // provide ascii value and not correct for long value
//********************************************************

        //Second Method
//********************************************************
//        System.out.println("Enter a Number ");
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//        try {
//            int num = Integer.parseInt(bf.readLine());
////            String num = (bf.readLine());
//
//            System.out.println(num);
//            bf.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//it can take input from anywhere from file from database
//*****************************************************************

        //Third Method
//*************************************************************
        System.out.println("Enter a Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();

    }
}
