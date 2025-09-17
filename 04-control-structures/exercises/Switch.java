/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable month (1-12).
 *    - Use a switch statement to print the corresponding month name.
 *
 * 2. Create a char variable grade ('A', 'B', 'C', 'D', 'F').
 *    - Use a switch statement to print the description:
 *      'A' -> "Excellent"
 *      'B' -> "Good"
 *      'C' -> "Average"
 *      'D' -> "Below Average"
 *      'F' -> "Fail"
 *      default -> "Invalid grade"
 *
 * 3. Create an int variable trafficLight (1, 2, 3).
 *    - Use a switch to print:
 *      1 -> "Red"
 *      2 -> "Yellow"
 *      3 -> "Green"
 *      default -> "Invalid light"
 *
 * 4. Create an int variable menuOption (1-5).
 *    - Use switch to print which action was chosen (e.g., "Option 1 selected").
 *
 * Bonus:
 * 5. Combine multiple cases to handle weekends:
 *    - day = 6 or 7 -> print "Weekend"
 *    - day = 1-5 -> print "Weekday"
 * -------------------------------------------------------------
 */

public class Switch
{
    public static void main(String[] args)
    {
        // -------------------- Student Exercises --------------------
        // 1. Create int month (1-12) and print month name using switch.
        int month = 1;
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid Month";
                break;
        }
        System.out.println("Month: " + monthName);
        // 2. Create char grade and print description using switch.
        // *      'A' -> "Excellent"
        // *      'B' -> "Good"
        // *      'C' -> "Average"
        // *      'D' -> "Below Average"
        // *      'F' -> "Fail"
        char grade = 'A';
        String gradeDescription;
        switch (grade) {
            case 'A':
                gradeDescription = "Good";
                break;
            case 'B':
                gradeDescription = "Excellent";
                break;
            case 'C':
                gradeDescription = "Average";
                break;
            case 'D':
                gradeDescription = "Below Average";
                break;
            case 'F':
                gradeDescription = "Fail";
                break;
            default:
                gradeDescription = "invalid grade";
        }
        System.out.println("Grade: " + grade + " (" + gradeDescription + ")");
        // 3. Create int trafficLight (1-3) and print light color using switch.
        int trafficLight = 1;
        String trafficLightColor;
        switch (trafficLight) {
            case 1:
                trafficLightColor = "Red";
                break;
            case 2:
                trafficLightColor = "Yellow";
                break;
            case 3:
                trafficLightColor = "Green";
                break;
            default:
                trafficLightColor = "Invalid light";
                break;
        }
        System.out.println("Traffic Light Color Status: " + trafficLightColor);
        // 4. Create int menuOption (1-5) and print which option is selected.
        int menuOption = 1;
        String choiceName;
        switch (menuOption) {
            case 1:
                choiceName = "Option 1";
                break;
            case 2:
                choiceName = "Option 2";
                break;
            case 3:
                choiceName = "Option 3";
                break;
            case 4:
                choiceName = "Option 4";
                break;
            case 5:
                choiceName = "Option 5";
                break;
            default:
                choiceName = "an INVALID OPTION";
                break;
        }
        System.out.println("You chose " +choiceName);
        // 5. Combine cases for weekends (6 and 7) vs weekdays (1-5).
        int day = 5;
        String dayType;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid Request";
        }
        System.out.println("Day type: " + dayType);
    }
}
