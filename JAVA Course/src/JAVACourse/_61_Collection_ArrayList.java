package JAVACourse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * The _61_Collection_ArrayList class demonstrates the use of Java collections,
 * specifically focusing on the Collection and List interfaces, and their implementation
 * using ArrayList.
 * <p>
 * This class highlights key functionalities of generics and Collection framework operations,
 * including:
 * - Creating and populating a Collection of type Integer.
 * - Iterating through the Collection using enhanced for loops to access and print elements.
 * - Creating and working with a List of type Integer, including adding elements and accessing them via the `get` method.
 * - Displaying the contents of both the Collection and List to the console.
 * <p>
 * The class emphasizes the use of type safety with generics, avoiding issues with
 * type mismatches during runtime, and demonstrates basic collection manipulation techniques.
 */
public class _61_Collection_ArrayList {
    /**
     * The main method serves as the entry point for the application.
     * It demonstrates the usage of generics for Collections and Lists in Java.
     * The method showcases the following:
     * - Creating a Collection of type Integer and adding elements to it.
     * - Iterating through the Collection using an enhanced for loop and printing each element.
     * - Creating a List of type Integer, adding elements, and accessing elements using the `get` method.
     * - Printing the contents of the Collection and List to the console.
     *
     * @param args Command-line arguments passed to the program (not used in this implementation).
     */
    public static void main(String[] args) {
//        Collection num = new ArrayList();
//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(4);
//        num.add(5);
// //throw error beacuse collection work on objects
//        for (int n : num) {
//            System.out.println(n);
//        }
//        for(Object n : num){
//            System.out.println(n);
//        }
        Collection<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
//        num.add('6');
        System.out.println(num);
        for (int n : num) {
            System.out.println(n);
        }

        List<Integer> nu = new ArrayList<Integer>();
        nu.add(1);
        nu.add(2);
        nu.add(3);
        nu.add(4);
        nu.add(5);
//        nu.add('6');
        System.out.println(num);
        System.out.println(nu.get(3));
        for (int n : nu) {
            System.out.println(n);
        }
    }
}
