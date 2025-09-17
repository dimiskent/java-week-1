/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create two new int variables (x and y) with any values.
 * 2. Perform addition, subtraction, multiplication, division,
 *    and modulus using x and y. Print the results.
 *
 * 3. Try division with values that don’t divide evenly
 *    (e.g., 7 / 2) and observe the result.
 * 4. Use double variables for division and compare the
 *    difference between int division and double division.
 * 5. Create three int variables, add them together,
 *    and print the total.
 *
 * Bonus:
 * 6. Calculate the square of a number using multiplication.
 * 7. Calculate the average of three numbers using division.
 * 8. Explore what happens if you divide a number by 0
 *    (hint: try int vs double).
 * -------------------------------------------------------------
 */

public class ArithmeticE
{
    public static void main(String[] args)
    {
        // -------------------- Student Exercises --------------------
        // 1. Create two int variables x and y, then perform all arithmetic operations.
        int x = 10;
        int y = 5;
        int addition = x + y;
        int substraction = x - y;
        int multiplication = x * y;
        int division = x / y;
        int modulus = x % y;
        System.out.println("Numbers: " + x + " and " + y);
        System.out.println("Addition: " + addition);
        System.out.println("Substraction: " + substraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
        // 2. Try division with numbers that don’t divide evenly (e.g., 7 / 2).
        System.out.println("Dividing 7 with 2");
        int intDivision = 7 / 2;
        System.out.println("Int: " + intDivision);
        // 3. Use double variables for division and compare with int division.
        double betterDivision = (double) 7 / 2; // we need to cast it, since it's a float
        System.out.println("Double: " + betterDivision);
        // 4. Create three int variables, add them, and print the total.
        int numberOne = 6;
        int numberTwo = 7;
        int numberThree = 8;
        int total = numberOne + numberTwo + numberThree;
        System.out.println("The addition of " + numberOne + " " + numberTwo + " and " + numberThree + " is " + total);
        // 5. Calculate the square of a number (e.g., 6 * 6).
        int square = 6 * 6;
        System.out.println("6² is " + square);
        // 6. Calculate the average of three numbers.
        int first = 1;
        int second = 2;
        int third = 3;
        int average = (first + second + third) / 3;
        System.out.println("Average: " + average);
        // 7. Try dividing a number by 0 (both int and double) and observe the behavior.
        System.out.println("Dividing by zero!");
        double doubleNumber = (double) 7 / 0;
        System.out.println("With a double: " + doubleNumber);
        try {
            int intNumber = (int) 7 / 0;
            System.out.println("With an int: " + intNumber);
        } catch(Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}
