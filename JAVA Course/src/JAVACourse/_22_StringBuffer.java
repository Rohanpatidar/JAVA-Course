package JAVACourse;

/**
 * The _22_StringBuffer class demonstrates various operations on the StringBuffer class in Java.
 * The StringBuffer is a mutable sequence of characters, allowing modification of the string content without creating new objects.
 * <p>
 * This class showcases the following operations:
 * <p>
 * - Creating a StringBuffer object and initializing it with a string.
 * - Obtaining the capacity of the StringBuffer object (indicating the allocated storage).
 * - Obtaining the length of the current string stored in the StringBuffer.
 * - Appending strings to the existing StringBuffer content.
 * - Deleting characters at a specific index within the StringBuffer.
 * - Inserting a string at a specific position within the StringBuffer.
 * - Setting the length of the StringBuffer, which can truncate or expand the string as needed.
 * - Converting the StringBuffer content to a regular String object.
 * <p>
 * This class demonstrates the dynamic and efficient nature of StringBuffer for string manipulation tasks in Java.
 */
public class _22_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Rohan ");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Patidar");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(2, "h");
        System.out.println(sb);
        sb.setLength(30);
        System.out.println(sb.length());

        String str = sb.toString();
    }
}
//String Builder