package JAVACourse;


/**
 * The MobileThird class represents a mobile device with attributes such as brand, price,
 * and name. It also includes a static initialization block and a default constructor
 * to initialize the object state.
 * <p>
 * Features of the MobileThird class:
 * <p>
 * - Provides a static block to perform actions or initialize static members when the class
 * is loaded.
 * - Includes a default constructor to initialize object properties and display a message.
 * - Contains a method to display the details of the mobile device, including the brand,
 * price, and static name.
 */
class MobileThird {
    String brand;
    int price;
    static String name;


    public MobileThird() {
        brand = "";
        price = 200;
        System.out.println("in constructor");


    }

    static {
        name = "Phone";
        System.out.println("IN static block");
    }


    public void show() {
        System.out.println("Brand " + brand + " Price " + price + " Name " + name);
    }
}


/**
 * The _25_StaticBlock class demonstrates the usage of the Class.forName() method
 * to load a class without explicitly creating its object. This approach is often
 * used to initialize or load classes dynamically at runtime.
 * <p>
 * In the provided code:
 * - The `Class.forName()` method is used to load the class named "MobileThird".
 * - This allows a class to be loaded and its static blocks or static initialization
 * logic (if any) to be executed, without instantiating the class using a constructor.
 * - No explicit creation of the object for the "MobileThird" class is performed in this example.
 */
public class _25_StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
//if we don't create object class
// not load so how we load class without making object

//        Class.forName("MobileThird");

        MobileThird obj1 = new MobileThird();
//        obj1.brand = "Oppo";
//        obj1.name = "SmartPhone";
//        MobileThird.name = "patidar";
//        obj1.price = 1500;
        obj1.show();


        MobileThird obj2 = new MobileThird();


    }
}

//Static block is use
// to initialize the static variable

/*
due to load class first static block call first and
also due to class load only once the static block
execute first
*/