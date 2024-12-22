package JAVACourse;

/**
 * The Laptop enum represents a collection of laptop models, each associated with a specific price.
 * It defines a series of constants corresponding to different laptop models and their default prices.
 * <p>
 * Key features of this enum include:
 * - Each laptop model has an associated price, which is initialized through either a parameterized constructor or a default value.
 * - Ability to retrieve and modify the price of a particular laptop model using getter and setter methods.
 * <p>
 * This enum showcases how constants can be extended to include additional properties and behavior,
 * making enumerations more versatile.
 */
enum Laptop {
    MacBook(2000), XPS(2200), SurfaceBook(2500), ThinkPad(2700), DELL(3000), HP(3200), ASUS(3400);
    private int price;

    //default constructor if it is not then error if we not give price
    private Laptop() {
        price = 500;
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


/**
 * The _45_EnumClass class demonstrates the use of Java enums and
 * their associated functionalities such as defining constants, modifying
 * and retrieving properties, and iterating through enum values.
 * <p>
 * This example utilizes an enum named Laptop, which defines a set of constants
 * representing different laptop models. Each constant has an associated price, which
 * can be modified using setter methods and retrieved using getter methods.
 * <p>
 * Key functionalities showcased in the _45_EnumClass include:
 * - Accessing a specific Laptop enum constant and modifying its price.
 * - Retrieving the updated price of a Laptop instance.
 * - Iterating through all constants in the Laptop enum using the values method.
 * <p>
 * Enums in this class illustrate the use of constructors, methods, and properties
 * to enhance the functionality of enumerated constants.
 */
public class _45_EnumClass {
    public static void main(String[] args) {
        Laptop laptops = Laptop.MacBook;
        laptops.setPrice(25000000);
        System.out.println(laptops.getPrice());
        for (Laptop l : Laptop.values()) {
            System.out.println(l + " : " + l.getPrice());
        }
    }
}
