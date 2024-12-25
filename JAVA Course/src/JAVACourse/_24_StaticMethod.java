package JAVACourse;


/**
 * The MobileSecond class represents a mobile device with attributes for its brand, price, and a static name.
 * It provides methods to display information about the mobile device.
 * <p>
 * Methods:
 * - show(): A non-static method to display the brand, price, and name of the mobile device instance.
 * - show1(): A static method demonstrating restrictions on accessing non-static members within static context.
 * - show2(MobileSecond obj): A static method that takes a MobileSecond object as a parameter to display its
 * brand, price, and name.
 * <p>
 * This class emphasizes the usage of instance and static variables, demonstrating restrictions and scopes
 * when handling such variables in static and non-static methods.
 */
class MobileSecond {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("Brand " + brand + " Price " + price + " Name " + name);
    }

    public static void show1() {
        //Static method only allow static variables
        //not allow directly
//        System.out.println("Brand " + brand + " Price " + price + " Name " + name);
        // allowing indirectly by passing object
    }

    public static void show2(MobileSecond obj) {
        System.out.println("Brand " + obj.brand + " Price " + obj.price + " Name " + obj.name);

    }
}


/**
 * The _24_StaticMethod class demonstrates the concept of static and non-static methods in Java.
 * It also showcases how to use static methods with or without objects and explains
 * the limitation of accessing instance variables directly in static methods.
 * <p>
 * This class provides the following functionalities:
 * - Creating instances of the MobileSecond class and initializing their fields.
 * - Demonstrating the invocation of instance methods on objects.
 * - Highlighting the difference between instance methods and static methods.
 * - Explaining the correct usage of static methods to interact with instance variables
 * by passing objects as arguments.
 */
public class _24_StaticMethod {
    public static void main(String[] args) {
        MobileSecond obj1 = new MobileSecond();
        obj1.brand = "Oppo";
        obj1.name = "SmartPhone";
        obj1.price = 1500;

        MobileSecond obj2 = new MobileSecond();
        obj2.brand = "Vivo";
        obj2.name = "Phone";
        obj2.price = 1700;
        obj1.show();
        obj2.show();
        //not allow  // MobileSecond.show();
        //allow due to static method
        MobileSecond.show1();
        MobileSecond.show2(obj1);
        MobileSecond.show2(obj2);


    }
}
