package JAVACourse;


/**
 * The Human class represents a human being with basic attributes such as age, name,
 * and grade. It provides methods to access and modify certain attributes.
 */
class Human {
    private int age = 11;
    private String name = "Rohan";
    private int garade;

    public int getAge() {
        return age;
    }

    public void setGarade(int a) {
        garade = a;
    }

    public String getName() {
        return name;
    }
}

/**
 * The _26_Encapsulation class demonstrates the concept of encapsulation in Java.
 * Encapsulation is a fundamental principle of object-oriented programming,
 * where the internal state of an object is hidden from the outside and only exposed
 * through controlled access methods such as getters and setters.
 * <p>
 * This class utilizes the following concepts:
 * <p>
 * - A `Human` class with private data members `age`, `name`, and an additional member `garade`.
 * - Getters (`getAge`, `getName`) to allow controlled retrieval of private member values.
 * - A setter (`setGarade`) to modify private member values while maintaining encapsulation.
 * <p>
 * This main class demonstrates how encapsulated data within an object can be accessed
 * or modified, ensuring data protection and flexibility for internal implementation changes.
 */
public class _26_Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
//        obj.age = 11;
//        obj.name = "Rohan";
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        obj.setGarade(30);


    }
}
//Private Variable is only Accessible in Same class
// private variable can only access by method set
// private variable can only access by method get