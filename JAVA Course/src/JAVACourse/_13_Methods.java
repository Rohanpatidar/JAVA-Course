package JAVACourse;

/**
 * The Computer class represents a generic computing device with basic functionalities.
 * It provides methods to perform operations such as playing music and retrieving a pen.
 */
class Computer {
    public void playMusic() {
        System.out.println("Playing Music.........");
    }

    public String getMeAPen(int cost) {
        return "Pen";
    }
}

/**
 * The _13_Methods class demonstrates how to invoke methods of another class.
 * This includes calling methods that perform actions and methods that return values.
 * <p>
 * The included example demonstrates the following concepts:
 * - Creating an instance of a class (`Computer` in this case).
 * - Calling a void method to execute a task (e.g., playing music).
 * - Calling a method that returns a value and handling the returned value.
 * <p>
 * These examples highlight basic method usage and their interaction with other components of a program.
 */
public class _13_Methods {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.playMusic();
        String str = com.getMeAPen(10);
        System.out.println(str);
    }
}
