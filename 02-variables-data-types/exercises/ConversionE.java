/**
 * Exercises:
 * ----------------------------------------------------------------
 * 1. Create a short variable with any value and assign it to an int (implicit).
 * 2. Create an int variable with a large value and assign it to a long (implicit).
 * 3. Create a long variable and assign it to a float (implicit).
 *
 * 4. Create a double variable and cast it to a float (explicit).
 * 5. Create an int variable and cast it to a short (explicit).
 * 6. Create a long variable and cast it to a byte (explicit).
 *
 * Bonus:
 * 7. Try converting a large int (e.g., 1000) to a byte and observe what happens (overflow).
 * 8. Convert a char (e.g., 'Z') into an int and print its ASCII value.
 * 9. Convert an int into a char and print the resulting character.
 * 10. Create a double with decimals, convert it to int, and explain what happens.
 * ----------------------------------------------------------------
 */

public class ConversionE
{
    public static void main(String[] args)
    {
        // --- Implicit Conversions (Widening) ---
        int intValue = 100;
        double widenedDouble = intValue; // int to double
        char letter = 'A';
        int widenedInt = letter;         // char to int (ASCII/Unicode value)

        System.out.println("=== Implicit (Widening) Conversions ===");
        System.out.println("int (" + intValue + ") → double: " + widenedDouble);
        System.out.println("char ('" + letter + "') → int: " + widenedInt);

        // --- Explicit Conversions (Narrowing) ---
        double doubleValue = 9.78;
        int narrowedInt = (int) doubleValue; // double to int (fraction lost)
        float floatValue = 130.75f;
        byte narrowedByte = (byte) floatValue; // float to byte (overflow possible)

        System.out.println("\n=== Explicit (Narrowing) Conversions ===");
        System.out.println("double (" + doubleValue + ") → int: " + narrowedInt);
        System.out.println("float (" + floatValue + ") → byte: " + narrowedByte);

        // -------------------- Student Exercises --------------------
        // 1. Create a short variable with any value and assign it to an int (implicit)
        short shortNumber = 76;
        int intNumber = shortNumber;
        // 2. Create an int variable with a large value and assign it to a long (implicit)
        int secondNumber = 69000000;
        long longNumber = secondNumber;
        // 3. Create a long variable and assign it to a float (implicit)
        long secondLongNumber = 999999999;
        float floatNumber = secondLongNumber;
        // 4. Create a double variable and cast it to a float (explicit)
        double doubleNumber = 199.9632928739432;
        float secondFloatNumber =  (float) doubleNumber;
        // 5. Create an int variable and cast it to a short (explicit)
        int tooBigForYou = 1839849289;
        short secondShortNumber = (short) tooBigForYou;
        // 6. Create a long variable and cast it to a byte (explicit)
        long tooLongForMyByte = 98317643;
        byte myByte = (byte) tooLongForMyByte;
        // 7. Try converting a large int (e.g., 1000) to a byte and print the result
        int largeInt = 1000;
        byte byteNum = (byte) largeInt;
        System.out.println("Converted " +largeInt+ " to a byte: " +byteNum);
        // 8. Convert a char (e.g., 'Z') into an int and print its ASCII value
        int letterToNumber = (char) 'Z';
        System.out.println("Letter converted to int: " + letterToNumber);
        // 9. Convert an int into a char and print the resulting character
        char numberToLetter = (int) 82;
        System.out.println("Int converted to letter: " + numberToLetter);
        // 10. Create a double with decimals, convert it to int, and print the result
        double finalNumber = 29292.99;
        int finalInt = (int) finalNumber;
        System.out.println("Double to INT: " + finalInt);
    }
}
