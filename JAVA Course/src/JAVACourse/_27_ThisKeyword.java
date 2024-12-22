package JAVACourse;

/**
 * The HumanOne class represents a simplified model of a human with attributes
 * such as age, name, and grade. It provides methods to access and modify these attributes.
 * <p>
 * The key features of this class include:
 * <p>
 * - Default values for age and name: The class initializes the age to 11 and name to "Rohan".
 * - Methods to retrieve individual attributes: Allows getting the values of age, name, and grade.
 * - A setter method for grade: Provides functionality to update the grade with proper handling
 * of local and instance variable conflict using the `this` keyword.
 * <p>
 * This class focuses on encapsulating the attributes and providing controlled access
 * through its getter and setter methods.
 */
class HumanOne {
    private int age = 11;
    private String name = "Rohan";

    private int grade;

    public int getAge() {
        return age;
    }


    public void setGrade(int grade) {
        //Issue is there the grade is loacl
        // variable and its change its own value,
        // but we change the instance variable
        //grade = grade;

        //this way also not correct because
        // this is new object

//        HumanOne obj1 = new HumanOne();
//        obj1.grade = grade;

        //This is the way but why we pass obj two times
//        HumanOne obj1 = obj;
//        obj1.grade = grade;

        //the correct way
        this.grade = grade;

    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


}

/**
 * The _27_ThisKeyword class demonstrates the usage of the `this` keyword
 * in Java, particularly for differentiating between local variables
 * and instance variables within a class.
 * <p>
 * The main method initializes an instance of the HumanOne class to
 * utilize its methods and interact with its properties. Specifically:
 * - The `HumanOne` class encapsulates properties such as age, name,
 * and grade, with methods to get and set these values.
 * - The `this` keyword is effectively used to resolve ambiguity
 * between local and instance variables in the `setGrade` method.
 * <p>
 * This class highlights the importance and correct usage of the `this`
 * keyword in object-oriented programming.
 */
public class _27_ThisKeyword {
    public static void main(String[] args) {
        HumanOne obj = new HumanOne();
        //        System.out.println(obj.getAge());
        // System.out.println(obj.getName());

        obj.setGrade(30);
        System.out.println(obj.getGrade());
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
}


