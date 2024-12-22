package JAVACourse;

/**
 * The _04_Typecast class demonstrates the concepts of type casting and type promotion in Java.
 * <p>
 * Type casting is the process of converting one data type into another.
 * There are two types of casting shown in this class:
 * 1. Explicit Casting: Narrowing conversion where larger data types are cast into smaller data types.
 * 2. Implicit Casting: Handled automatically when assigning smaller data types to larger ones.
 * <p>
 * Type promotion is demonstrated during arithmetic operations where smaller data types are
 * promoted to larger ones, as needed, to prevent data loss.
 * <p>
 * The examples in this class include:
 * - Explicit type casting of `int` to `byte` and `float` to `int`.
 * - Type promotion of smaller data types in arithmetic operations.
 */
public class _04_Typecast {
    public static void main(String[] args) {
        //TypeCasting

//        byte b= 127;
//        System.out.println(b);
//        byte b= 127;
        int a = 254;
        byte k = (byte) a;
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);


        //TypePromotion

        byte d = 10;
        byte e = 30;
        int result = d * e;
        System.out.println(result);


    }
}
