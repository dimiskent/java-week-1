/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two boolean variables x = true, y = false.
 *    - Use && to check if both are true.
 *    - Use || to check if at least one is true.
 *    - Use ! to invert their values and print results.
 *
 * 2. Create three boolean variables a = true, b = false, c = true.
 *    - Evaluate the expression: (a && b) || c and print the result.
 *    - Evaluate the expression: !(a || b) && c and print the result.
 *
 * 3. Write a condition to check if a number n = 15 is:
 *    - Greater than 10 **AND** less than 20.
 *    - Not equal to 12 **OR** less than 5.
 *
 * Bonus:
 * 4. Combine multiple logical operators with parentheses
 *    to control the order of evaluation and test different cases.
 * -------------------------------------------------------------
 */

public class LogicalE
{
    public static void main(String[] args)
    {
        // -------------------- Student Exercises --------------------
        // 1. Create boolean x = true, y = false and test &&, ||, ! operators.
        boolean trueBool = true;
        boolean falseBool = false;
        System.out.println("&& => " + (trueBool && falseBool));
        System.out.println("|| =>" + (trueBool || falseBool));
        System.out.println("!trueBool => " + !trueBool);
        System.out.println("!falseBool => " + !falseBool);
        // 2. Create a = true, b = false, c = true; evaluate:
        //    (a && b) || c and !(a || b) && c
        var thirdBool = true;
        System.out.println("(trueBool && falseBool) || thirdBool => " + ((trueBool && falseBool) || thirdBool));
        System.out.println("!(trueBool || falseBool) && thirdBool => " + (!(trueBool || falseBool) && thirdBool));
        // 3. Create int n = 15; check if n > 10 && n < 20,
        //    and n != 12 || n < 5.
        int num = 15;
        boolean checkOne = (num > 10 && num < 20);
        boolean checkTwo =  (num != 12 || num < 5);
        System.out.println("num > 10 && num < 20 gives " + checkOne);
        System.out.println("num != 12 || num < 5 gives " + checkOne);
        // 4. Combine multiple logical operators with parentheses
        //    to test order of evaluation.
    }
}
