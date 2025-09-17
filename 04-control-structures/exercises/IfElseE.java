/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable x and check if it is even or odd using if-else.
 *
 * 2. Create an int variable age.
 *    - If age >= 18, print "Adult".
 *    - Else, print "Minor".
 *
 * 3. Create an int variable score (0-100).
 *    - Use if-else to assign grades:
 *      >=90 -> "A"
 *      >=75 -> "B"
 *      >=50 -> "C"
 *      <50  -> "F"
 *
 * 4. Create a double variable temperature.
 *    - If temperature > 30, print "Hot".
 *    - Else if temperature >= 20, print "Warm".
 *    - Else, print "Cold".
 *
 * Bonus:
 * 5. Combine two conditions using logical operators:
 *    - Check if a number n is positive **and** even.
 * -------------------------------------------------------------
 */

public class IfElseE
{
    public static void main(String[] args)
    {
        // -------------------- Student Exercises --------------------
        // 1. Check if x is even or odd.
        int myNumber = 5;
        if(myNumber % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        // 2. Check age and print "Adult" or "Minor".
        int age = 18;
        if(age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
        // 3. Assign grades based on score using if-else if-else.
        int grade = 49;
        char gradeResult;
        if(grade >= 90) {
            gradeResult = 'A';
        } else if(grade >= 75) {
            gradeResult = 'B';
        } else if (grade >= 50) {
            gradeResult = 'C';
        } else {
            gradeResult = 'F';
        }
        System.out.println("Your grade is an " +gradeResult);
        // 4. Check temperature and print "Hot", "Warm", or "Cold".
        String tempStatus;
        int temperature = 30;
        if(temperature > 30) {
            tempStatus = "Hot";
        } else if(temperature >= 20) {
            tempStatus = "Warm";
        } else {
            tempStatus = "Cold";
        }
        System.out.println(tempStatus);
        // 5. Check if n is positive AND even using logical operators.
        int n = 2;
        boolean myCondition = false;
        if(n >= 0 && n % 2 == 0) {
            myCondition = true;
        }
        System.out.println(myCondition);
    }
}
