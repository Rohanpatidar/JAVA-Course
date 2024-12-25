package JAVACourse;

import java.util.Hashtable;
import java.util.Map;
import java.util.HashMap;

/**
 * The _63_Map class demonstrates the use of Map collections in Java.
 * It provides examples of working with HashMap and Hashtable implementations.
 * <p>
 * Key concepts showcased in this class include:
 * - Use of HashMap: Allows storing key-value pairs without any synchronized behavior.
 * - Use of Hashtable: Provides a synchronized version for multithreaded use cases.
 * - Adding elements to a map using the `put` method.
 * - Overwriting values in a map when the same key is used multiple times.
 * - Querying map contents using methods like `containsKey`, `containsValue`, and `get`.
 * - Accessing keys and values using `keySet` and iterating through the map.
 * <p>
 * This class illustrates the basic functionalities and usage patterns of Map collections in Java.
 */
public class _63_Map {
    public static void main(String[] args) {
        Map<String, Integer> stud = new HashMap<>();
        Map<String, Integer> stu01d = new Hashtable<>();//use when you work on thread, or you get synchronized version

        stud.put("Rakshita", 19);
        stud.put("Rakshita", 18);
        stud.put("Rohan", 20);
        stud.put("Harsh", 17);
        stud.put("Xyz", 25);


        System.out.println(stud);
        System.out.println(stud.containsKey("Harsh"));
        System.out.println(stud.get("Harsh"));
        System.out.println(stud.containsValue(18));
        System.out.println(stud.keySet());
        for (String key : stud.keySet()) {
            System.out.println(key + " " + stud.get(key));
        }
    }
}
