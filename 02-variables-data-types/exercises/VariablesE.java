import java.lang.constant.Constable;

/**
 * Exercises:
 * ---------------------------------------------------------------------
 * 1. Create a variable of type 'char' called myLetter and assign it any letter.
 * 2. Create a variable of type 'float' called myFloat and assign it any decimal value.
 * 3. Create a variable of type 'long' called myBigNumber and assign it a large number.
 * 4. Create a variable of type 'byte' called mySmallNumber and assign it a small number.
 * 5. Create a variable of type 'short' called myShortNumber and assign it a number.
 *
 * Bonus:
 * 6. Change the value of an existing variable (for example, myNumber) and print it again.
 * 7. Create two int variables, add them together, and print the result.
 * 8. Create a String variable for your name and print a greeting message using it.
 */

public class VariablesE
{
    public static void main(String[] args)
    {
        // Variable declaration and initialization (already done for you)
        int myNumber = 10;
        String myText = "Hello, World!";
        double myDecimal = 5.99;
        boolean myBoolean = true;

        // Print variables to the console
        System.out.println("Integer: " + myNumber);
        System.out.println("String: " + myText);
        System.out.println("Double: " + myDecimal);
        System.out.println("Boolean: " + myBoolean);

        // -------------------- Student Exercises --------------------
        // 1. Create a char variable called myLetter and assign it any letter
        char myLetter = 'C';
        // 2. Create a float variable called myFloat and assign it any decimal
        float myFloat = 6.9f;
        // 3. Create a long variable called myBigNumber and assign it a large number
        long myBigNumber = 7900000;
        // 4. Create a byte variable called mySmallNumber and assign it a small number
        byte mySmallNumber = 67;
        // 5. Create a short variable called myShortNumber and assign it a number
        short myShortNumber = 27000;
        // 6. Change the value of myNumber and print the new value
        myNumber = 66;
        System.out.println(myNumber);
        // 7. Create two int variables, add them, and print the result
        int numberOne = 2;
        int numberTwo = 4;
        numberOne += numberTwo;
        System.out.println(numberOne);
        // 8. Create a String variable for your name and print a greeting message
        String myName = "Dimitrios";
        System.out.println("Hello, " +myName+ "! How are you? :)");
    }
}
