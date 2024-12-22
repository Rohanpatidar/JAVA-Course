package JAVACourse;

/**
 * The _10_Switch_Statement class demonstrates the use of a switch statement in Java.
 * A switch statement allows branching control based on the value of an expression.
 * <p>
 * In this example:
 * - The expression evaluated by the switch statement is an integer.
 * - Each case corresponds to a specific value that the expression can take.
 * - If a match is found, the associated block of code is executed.
 * - The `break` statement ensures that execution exits the switch after a match is executed.
 * - A `default` case is provided to handle any unmatched values.
 * <p>
 * The switch structure is a compact way to replace multiple `if-else` conditions
 * when checking against constant values.
 */
public class _10_Switch_Statement {
    public static void main(String[] args) {
        int n = 'a';
        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
