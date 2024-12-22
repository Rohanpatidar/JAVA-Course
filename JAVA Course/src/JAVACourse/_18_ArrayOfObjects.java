package JAVACourse;

/**
 * The Student class represents the details of a student.
 * It includes attributes to store the student's roll number, name, and marks.
 * <p>
 * Fields:
 * - rollno: An integer representing the roll number of the student.
 * - name: A string containing the name of the student.
 * - marks: An integer representing the marks obtained by the student.
 */
class Student {
    int rollno;
    String name;
    int marks;
}

/**
 * The _18_ArrayOfObjects class demonstrates how to work with arrays of objects in Java.
 * It showcases the process of creating, initializing, and accessing objects stored in an array.
 * <p>
 * Key concepts highlighted in this class include:
 * - Defining a custom class (Student) with properties such as roll number, name, and marks.
 * - Creating multiple instances of the Student class and assigning values to their attributes.
 * - Storing objects in an array and iterating over the array using enhanced for-loops.
 * - Accessing and displaying object attributes from the array.
 * <p>
 * This class emphasizes the utility of arrays to store and manage collections of objects,
 * as well as the mechanism to manipulate and access their data in a structured way.
 */
public class _18_ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks = 20;
        s1.name = "Rohan";
        s1.rollno = 1;

        Student s2 = new Student();
        s2.marks = 20;
        s2.name = "Rishabh";
        s2.rollno = 2;

        Student s3 = new Student();
        s3.marks = 20;
        s3.name = "Rakshita";
        s3.rollno = 3;
//        System.out.println(s1.name);
        Student st[] = new Student[3];
        st[0] = s1;
        st[1] = s2;
        st[2] = s3;
//        for (int i = 0; i < st.length; i++) {
//            System.out.println(st[i].name);
//        }
        for (Student stud : st) {
            System.out.println(stud.rollno + ")" + stud.name + ":" + stud.marks);
        }
    }
}
