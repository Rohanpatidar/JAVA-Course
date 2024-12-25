package JAVACourse;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * The _62_Set class demonstrates the use of Set collections in Java to store unique elements.
 * It provides an example of both HashSet and TreeSet implementations.
 * <p>
 * Key features included in this class:
 * - Usage of HashSet: Stores unique elements with no guaranteed order.
 * - Usage of TreeSet: Stores unique elements in sorted (ascending) order.
 * - Illustration of behavior when attempting to add duplicate elements, showing how Sets enforce uniqueness.
 * <p>
 * This example showcases the distinction between unordered and ordered collections, as well as the
 * characteristics of these two specific implementations of the Set interface.
 */
public class _62_Set {
    /**
     * The main method demonstrates the functionality of Set collections in Java,
     * specifically the differences between HashSet and TreeSet in terms of storing unique elements.
     * <p>
     * The method performs the following operations:
     * - Creates a HashSet to store Integer values, adds elements to it, and prints the contents.
     * Duplicates are ignored, and output order is not guaranteed.
     * - Creates a TreeSet to store Integer values, adds elements to it, and prints the contents.
     * Duplicates are ignored, and elements are displayed in sorted (ascending) order.
     *
     * @param args Command-line arguments passed to the main method.
     */
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<Integer>();
        num.add(72);
        num.add(35);
        num.add(84);
        num.add(35);
        num.add(91);

        for (Integer i : num) {
            System.out.println(i);
        }
        System.out.println("Tree Set");

        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(72);
        nums.add(35);
        nums.add(84);
        nums.add(35);
        nums.add(91);

        for (Integer i : nums) {
            System.out.println(i);
        }

    }
}
