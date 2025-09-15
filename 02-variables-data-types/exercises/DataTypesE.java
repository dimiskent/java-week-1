/**
 * Exercises:
 * -----------------------------------------------------------------
 * 1. Create an int variable called age and assign it your age.
 * 2. Create a double variable called temperature and assign it any decimal number.
 * 3. Create a char variable called gradeLetter and assign it a letter (e.g., 'B').
 * 4. Create a boolean variable called isJavaFun and assign it true or false.
 *
 * 5. Create a String variable called favoriteColor and assign it any color.
 * 6. Create an array of type int called numbers with at least 5 values, then print them.
 * 7. Change one of the values inside the array and print the updated array.
 *
 * Bonus:
 * 8. Create a String array with 3 of your favorite foods and print them in a loop.
 * 9. Create two double variables, add them together, and print the result.
 * 10. Use String concatenation to print a sentence like: "My name is John and I am 20 years old."
 * -----------------------------------------------------------------
 */

public class DataTypesE
{
    public static void main(String[] args)
    {
        // --- Primitive Data Types ---
        int myInt = 10;
        double myDouble = 10.5;
        char myChar = 'A';
        boolean myBoolean = true;

        // --- Non-Primitive Data Types ---
        String myString = "Hello, World!";
        int[] grades = {90, 85, 88};

        // --- Displaying the values ---
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + myString);
        System.out.print("Array of grades: ");
        for (int grade : grades)
        {
            System.out.print(grade + " ");
        }
        System.out.println();

        // -------------------- Student Exercises --------------------
        // 1. Create an int variable called age and assign it your age
        int myAge = 18;
        // 2. Create a double variable called temperature and assign it any decimal
        double temperature = 27;
        // 3. Create a char variable called gradeLetter and assign it a letter
        char gradeLetter = 'C';
        // 4. Create a boolean variable called isJavaFun and assign true or false
        boolean isJavaFun = true;
        // 5. Create a String variable called favoriteColor and assign it a color
        String favoriteColor = "Blue";
        // 6. Create an int array called numbers with at least 5 values, then print them
        int[] numbers = {2, 4, 6, 8, 10};
        for(int number : numbers) {
            System.out.println("Number: " + number);
        }
        // 7. Change one value inside numbers and print the updated array
        numbers[3] = 7;
        System.out.println("New number: " + numbers[3]);
        // 8. Create a String array with 3 favorite foods and print them in a loop
        String[] favoriteFoods = {
                "Pastitsio",
                "Gyros",
                "Durum"
        };
        for(String favoriteFood : favoriteFoods) {
            System.out.println("Favorite food: " + favoriteFood);
        }
        // 9. Create two double variables, add them together, and print the result
        double numberOne = 3;
        double numberTwo = 7;
        numberOne += numberTwo;
        System.out.println(numberOne);
        // 10. Use String concatenation to print: "My name is ___ and I am ___ years old."
        String myName = "Dimitrios";
        System.out.println("My name is " + myName + " and I am " + myAge + " years old");
    }
}
