/**
 * Loops Exercises
 * -------------------------------------------------------------
 * 1- For Loop
 * 2- While Loop
 * 3- Do-While Loop
 * 4- For-Each Loop
 * 5- Nested Loops
 * 6- Break and Continue Statements
 *
 * Each exercise is designed to help students practice loops.
 */

public class LoopsExercise
{
    public static void main(String[] args)
    {
        // -------------------- 1. For Loop --------------------
        // Exercise 1:
        // - Create a for loop to print numbers from 10 to 1 (reverse order).
        for (int x = 10; x > 0; x--) {
            System.out.println(x);
        }
        // Exercise 2:
        // - Use a for loop to print the multiplication table of 7 (1 to 10).
        for (int x = 1; x <= 10; x++) {
            System.out.println("7 times " + x + ": " + 7*x);
        }
        // -------------------- 2. While Loop --------------------
        // Exercise 3:
        // - Create a while loop to sum numbers from 1 to 100 and print the total.
        int num = 1;
        int total = 0;
        while(num <= 100) {
            total += num++;
        }
        System.out.println(total);
        // Exercise 4:
        // - Use a while loop to print all odd numbers between 1 and 20.
        num = 1;
        while(num <= 20) {
            if(num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        }
        // -------------------- 3. Do-While Loop --------------------
        // Exercise 5:
        // - Create a do-while loop that asks the user to enter a number (simulate with a variable)
        //   and repeats until the number is negative.
        int numberToLower = 5;
        do {
            numberToLower--;
            System.out.println(numberToLower);
        } while (numberToLower > 0);

        // -------------------- 4. For-Each Loop --------------------
        // Exercise 6:
        // - Create an array of colors: {"Red", "Green", "Blue", "Yellow"}.
        //   Use a for-each loop to print each color in uppercase.
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        for(String color : colors) {
            System.out.println(color.toUpperCase());
        }
        // Exercise 7:
        // - Create an int array {2, 4, 6, 8, 10} and use for-each to calculate the sum.
        int[] numbers = {2, 4, 6, 8, 10};
        int totalNumber = 0;
        for(int number : numbers) {
            totalNumber += number;
        }
        System.out.println(totalNumber);
        // -------------------- 5. Nested Loops --------------------
        // Exercise 8:
        // - Use nested loops to print a 3x3 multiplication table (1*1 to 3*3).
        // Behold, the most cursed implementation
        System.out.println(" | 1 | 2 | 3 |");
        System.out.println("--------------");
        for (int n = 1; n <= 3; n++) {
            System.out.print(n + "| ");
            for(int x = 1; x <= 3; x++) {
                System.out.print(x*n + "   ");
            }
            System.out.println();
        }
        // Exercise 9:
        // - Use nested loops to print the following pattern:
        //   *
        //   **
        //   ***
        //   ****
        int pts = 1;
        while(pts <= 4) {
            for(int x = 1; x <= pts; x++) {
                System.out.print('*');
            }
            System.out.println();
            pts++;
        }
        // -------------------- 6. Break and Continue --------------------
        // Exercise 10:
        // - Create a for loop from 1 to 20.
        //   - Skip multiples of 3 using continue.
        //   - Stop the loop if the number is greater than 15 using break.
        for(int n = 1; n <= 20; n++) {
            if(n > 15) {
                break;
            }
            if(n % 3 == 0) {
                continue;
            }
            System.out.println(n);
        }
        // Exercise 11:
        // - Use a while loop to print numbers 1 to 10, but stop when a number divisible by 7 is reached.
        int numberLoop = 1;
        while (numberLoop <= 10) {
            if(numberLoop % 7 == 0) {
                break;
            }
            System.out.println(numberLoop);
            numberLoop++;
        }
    }
}
