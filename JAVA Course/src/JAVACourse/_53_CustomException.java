package JAVACourse;

/**
 * The MyException class is a custom exception that extends the base Exception class.
 * This class allows for creating specific exception types with tailored error messages
 * to handle unique error conditions in an application.
 * <p>
 * Constructors:
 * - MyException(String sorry): Accepts a message string that provides details about the exception.
 */
class MyException extends Exception {
    public MyException(String sorry) {

        super(sorry);
    }


}

/**
 * The _53_CustomException class demonstrates the creation and usage of custom exceptions in Java.
 * This class includes a main method that triggers a custom exception under specific conditions
 * and handles the exception using a try-catch block.
 * <p>
 * Key concepts highlighted in this class include:
 * - Creating a custom exception class (`MyException`).
 * - Throwing an instance of a custom exception with a specific error message.
 * - Handling the custom exception using a catch block and displaying the exception details.
 * <p>
 * This example showcases how custom exceptions can be designed and utilized to indicate
 * specific error scenarios in an application.
 */
public class _53_CustomException {
    public static void main(String[] args) {
        int i = 11;
        try {
            if (i == 11) {
                throw new MyException("Sorry");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}