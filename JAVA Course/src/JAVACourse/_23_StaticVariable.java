package JAVACourse;


//class Mobile {
//    String brand;
//    int price;
//    String name;
//
//    public void show() {
//        System.out.println("Brand " + brand + " Price " + price + " Name " + name);
//    }
//}
//
//public class _23_StaticVariable {
//
//    public static void main(String[] args) {
//        Mobile obj1 = new Mobile();
//        obj1.brand = "Oppo";
//        obj1.name = "SmartPhone";
//        obj1.price = 1500;
//
//        Mobile obj2 = new Mobile();
//        obj2.brand = "Vivo";
//        obj2.name = "SmartPhone";
//        obj2.price = 1700;
//        obj1.show();
//        obj2.show();
//
//    }
//}

//Static  Affect all the variables


/**
 * Represents a mobile device with attributes for brand, price, and name.
 * This class provides functionality to display information about the mobile.
 * <p>
 * Fields:
 * - `brand`: The brand of the mobile device.
 * - `price`: The price of the mobile device.
 * - `name`: A static field representing a shared name attribute for all mobile instances.
 * <p>
 * Methods:
 * - `show()`: Displays the brand, price, and name of the mobile device.
 */
class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("Brand " + brand + " Price " + price + " Name " + name);
    }
}

/**
 * The _23_StaticVariable class demonstrates the concept of static variables in Java.
 * <p>
 * The static variable `name` in the `Mobile` class is shared across all instances, meaning
 * its value is the same for all objects of the `Mobile` class. This class includes examples
 * to showcase how static variables behave differently compared to instance variables.
 * <p>
 * Key concepts demonstrated:
 * - Creating multiple objects of the `Mobile` class and setting instance variables (`brand`
 * and `price`) independently for each object.
 * - Observing how the static variable `name` is shared among all objects while retaining
 * its last assigned value.
 * <p>
 * The `show` method of the `Mobile` class outputs the state of the instance variables and
 * the static variable to the console, illustrating their behavior with object data.
 */
public class _23_StaticVariable {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Oppo";
        obj1.name = "SmartPhone";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Vivo";
        obj2.name = "Phone";
        obj2.price = 1700;
        obj1.show();
        obj2.show();

    }
}
//static variables share the data with everyone