/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two int variables x = 15, y = 25.
 *    - Use a ternary operator to find and print the minimum value.
 *
 * 2. Create an int variable age = 18.
 *    - Use a ternary operator to print "Adult" if age >= 18, otherwise "Minor".
 *
 * 3. Create three int variables a = 10, b = 20, c = 15.
 *    - Use nested ternary operators to find the largest of the three numbers.
 *
 * 4. Create a boolean variable isRaining = true.
 *    - Use a ternary operator to print "Take an umbrella" if true, else "No umbrella needed".
 *
 * Bonus:
 * 5. Use a ternary operator to check if a number n = 7 is even or odd and print the result.
 * -------------------------------------------------------------
 */

public class TernaryE
{
    public static void main(String[] args)
    {
        // -------------------- Student Exercises --------------------
        // 1. Create int x = 15, y = 25; use ternary to find minimum.
        int numberOne = 15;
        int numberTwo = 25;
        int min = numberOne < numberTwo ? numberOne : numberTwo;
        System.out.println("Minimum btw " + numberOne + " and " + numberTwo + ": " + min);
        // 2. Create int age = 18; use ternary to print "Adult" or "Minor".
        int age = 18;
        String ageGroup = age >= 18 ? "Adult" : "Minor";
        System.out.println(ageGroup);
        // 3. Create int a = 10, b = 20, c = 15; use nested ternary to find largest.
        int number1 = 10;
        int number2 = 20;
        int number3 = 15;
        int largestNumber = (number1 > number2) ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
        System.out.println(largestNumber);
        // 4. Create boolean isRaining = true; use ternary to print umbrella advice.
        boolean isRaining = true;
        String message = isRaining ? "ITS RAINING TAKE AN UMBRELLA IN ORDER NOT TO GET WET" : "No advice needed";
        System.out.println(message);
        // 5. Check if n = 7 is even or odd using ternary and print.
        int n = 7;
        boolean isEven = (double) n % 2 != 0 ? false : true;
        System.out.println("Is " + n + " even? " + isEven);
    }
}
