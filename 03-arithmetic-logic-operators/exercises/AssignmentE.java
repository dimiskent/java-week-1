/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create a new int variable b with the value 20.
 *    - Use += to add 10 to b and print the result.
 *    - Use -= to subtract 5 from b and print the result.
 *
 * 2. Create another int variable c with the value 15.
 *    - Multiply c by 3 using *= and print the result.
 *    - Divide c by 2 using /= and print the result.
 *
 * 3. Use %= with c to find the remainder when divided by 4.
 *
 * 4. Create a double variable d = 12.5.
 *    - Use += and *= to update d and print results.
 *
 * Bonus:
 * 5. Create a variable x = 7.
 *    - Use x += x to double its value.
 *    - Use x *= x to square its value.
 *
 * 6. Combine assignment operators in a sequence:
 *    Example: Start with y = 50, then apply -= 10, *= 2, /= 5, and %= 6.
 *    Print the value after each step.
 * -------------------------------------------------------------
 */

public class AssignmentE
{
    public static void main(String[] args)
    {
        // -------------------- Student Exercises --------------------
        // 1. Create an int variable b = 20 and use +=, -= with it.
        int b = 20;
        System.out.println("Current B value: " + b);
        b += 5;
        System.out.println("Current B value: " + b);
        b -= 24;
        System.out.println("Current B value: " + b);
        // 2. Create an int variable c = 15 and use *=, /= with it.
        int c = 5;
        System.out.println("Current C value: " + c);
        c *= 6;
        System.out.println("Current C value: " + c);
        c /= 2;
        System.out.println("Current C value: " + c);
        // 3. Use %= with c to find remainder when divided by 4.
        c %= 4;
        System.out.println("Division remainder: " + c);
        // 4. Create a double variable d = 12.5, then use += and *=.
        double myNumber = 12.5;
        System.out.println("Current number: " + myNumber);
        myNumber += 3.5;
        System.out.println("Current number: " + myNumber);
        myNumber *= 0.7;
        System.out.println("Current number: " + myNumber);
        // 5. Create x = 7, double it with +=, then square it with *=.
        int x = 7;
        System.out.println("Current X value: " + x);
        x += 7;
        System.out.println("Current X value: " + x);
        x *= 7;
        System.out.println("Current X value: " + x);
        // 6. Start y = 50, apply -= 10, *= 2, /= 5, %= 6 step by step.
        int y = 50;
        System.out.println("Current Y value: " + y);
        y -= 10;
        System.out.println("Current Y value: " + y);
        y *= 2;
        System.out.println("Current Y value: " + y);
        y /= 5;
        System.out.println("Current Y value: " + y);
        y %= 6;
        System.out.println("Current Y value: " + y);
    }
}
