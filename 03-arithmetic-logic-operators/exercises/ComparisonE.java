/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables a = 50 and b = 25.
 *    - Check if a is equal to b.
 *    - Check if a is greater than b.
 *    - Check if a is less than or equal to b.
 *
 * 2. Create two double variables p = 5.5 and q = 7.2.
 *    - Compare p and q using >, <, and ==.
 *
 * 3. Create a char variable c1 = 'A' and c2 = 'B'.
 *    - Compare if c1 < c2 (hint: uses ASCII values).
 *
 * 4. Create a boolean expression that checks if:
 *    - x (10) is less than y (20) **AND** x is not equal to y.
 *
 * Bonus:
 * 5. Compare two strings (e.g., "Hello" and "World") using `.equals()`
 *    instead of `==`, and explain the difference.
 *
 * 6. Create three int variables and find out which one is the largest
 *    using comparison operators (no `Math.max`).
 * -------------------------------------------------------------
 */

public class ComparisonE
{
    public static void main(String[] args)
    {
        // -------------------- Student Exercises --------------------
        // 1. Create int a = 50, b = 25 and compare them.
        int number1 = 50;
        int number2 = 25;
        boolean isEqual = (number1 == number2);
        boolean isGreater = (number1 > number2);
        boolean isLessOrEqual = (number1 <= number2);
        System.out.println("Num 1 is equal to Num 2: " + isEqual);
        System.out.println("Num 1 is greater than Num 2: " + isGreater);
        System.out.println("Num 1 is equal or less than Num 2: " + isLessOrEqual);
        // 2. Create double p = 5.5, q = 7.2 and compare them.
        double double1 = 5.5;
        double double2 = 7.2;
        boolean isEqualDouble = (double1 == double2);
        boolean isGreaterDouble = (double1 > double2);
        boolean isLessOrEqualDouble = (double1 < double2);
        System.out.println("Double 1 is equal to Double 2: " + isEqualDouble);
        System.out.println("Double 1 is greater than Double 2: " + isGreaterDouble);
        System.out.println("Double 1 is equal or less than Double 2: " + isLessOrEqualDouble);
        // 3. Create char c1 = 'A', c2 = 'B' and check if c1 < c2.
        char letter1 = 'A';
        char letter2 = 'B';
        boolean isBigger = (letter1 > letter2);
        System.out.println("A is greater than B: " + isBigger);
        // 4. Check if (x < y) AND (x != y).
        int num1 = 10;
        int num2 = 20;
        boolean myConditions = (num1 < num2) && (num1 != num2);
        System.out.println("x (10) is less than y (20) **AND** x is not equal to y: " + myConditions);
        // 5. Compare two Strings using .equals() instead of ==.
        String word1 = "Hello";
        String word2 = "World";
        boolean wordMatch = word1.matches(word2);
        word2 = "(?i)hello";
        boolean wordMatch2 = word1.matches(word2);
        boolean wordMatchLegacy = (word1 == word2);
        System.out.println("Word match with .matches " + wordMatch);
        System.out.println("Word match with == " + wordMatchLegacy);
        System.out.println("REGEX " + word2 + " match with .matches " + wordMatch2);
        /*
            With ==, it checks for the memory reference of the object
            With .matches, it will check the internal value of the object. It also allows for REGEX
        */
        // 6. Create three int variables and determine the largest.
        int numVarOne = 45;
        int numVarTwo = 3;
        int numVarThree = 53;
        // tighten your seatbelt for this one
        int theGreatest = (numVarOne > numVarTwo) ?
                ((numVarOne > numVarThree) ? numVarOne : numVarThree) :
                ((numVarTwo > numVarThree) ? numVarTwo : numVarThree);
        System.out.println("Greatest Number: " + theGreatest);
    }
}
