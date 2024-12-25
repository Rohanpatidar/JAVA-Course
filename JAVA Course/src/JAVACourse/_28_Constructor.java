package JAVACourse;

/**
 * The HumanTwo class represents a simple model of a human being with basic attributes
 * such as age and name. It provides getter and setter methods to access and modify
 * these attributes and includes a default constructor.
 * <p>
 * Attributes:
 * - age: An integer representing the age of the human.
 * - name: A string representing the name of the human.
 * <p>
 * Methods:
 * - getAge(): Retrieves the value of the age attribute.
 * - setAge(int age): Sets the value of the age attribute.
 * - getName(): Retrieves the value of the name attribute.
 * - setName(String name): Sets the value of the name attribute.
 * - HumanTwo(): Default constructor that initializes the object and prints a message.
 */
class HumanTwo {
    private int age;
    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HumanTwo() {
        System.out.println("In constructor");
    }
}


/**
 * The _28_Constructor class demonstrates the creation of objects and the use of constructors in Java.
 * <p>
 * Key Features:
 * - Objects of the `HumanTwo` class are instantiated within the `main` method.
 * - The constructor of the `HumanTwo` class is invoked during object creation, illustrating the automatic
 * execution of a constructor.
 * - This class demonstrates setting and retrieving the properties of objects using getter and setter methods
 * for encapsulated fields.
 * <p>
 * Functionalities:
 * - Sets the `age` and `name` properties of a `HumanTwo` object using the `setAge` and `setName` methods.
 * - Retrieves the `age` and `name` properties using the `getAge` and `getName` methods.
 * <p>
 * Purpose:
 * - Highlights how to work with encapsulation, constructors, and object-oriented principles in Java.
 */
public class _28_Constructor {
    public static void main(String[] args) {

        HumanTwo obj = new HumanTwo();
        HumanTwo obj1 = new HumanTwo();

        obj.setAge(30);
        obj.setName("Rohan");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}

//Every time we create object constructor called