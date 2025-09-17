/**
 * Exercises: Input and Output in Java
 * -----------------------------------------------------
 * This program demonstrates:
 * 1. Output
 *   - System.out.print(): Prints text without a newline.
 *   - System.out.println(): Prints text with a newline.
 *   - System.out.printf(): Prints formatted text.
 *
 * 2. Input (using Scanner)
 *   - nextLine(): Reads a line of text.
 *   - nextInt(): Reads an integer.
 *   - nextDouble(): Reads a double.
 *   - next(): Reads a single word.
 *
 * -----------------------------------------------------
 * 🚀 Student Exercises:
 * 1. Ask the user for their first name and last name separately,
 *    then print: "Hello, FirstName LastName!"
 *
 * 2. Ask the user to enter two integers and print their sum, difference,
 *    product, and quotient using System.out.printf for formatting.
 *
 * 3. Ask the user for the radius of a circle (double) and calculate
 *    the area (πr²) and circumference (2πr).
 *
 * 4. Ask the user to enter their age, then print whether they are
 *    a child (<13), teenager (13–19), or adult (20+).
 *
 * 5. Create a simple "login" simulation:
 *    - Ask the user for a username and password.
 *    - If username = "admin" and password = "1234",
 *      print "Access granted".
 *    - Otherwise, print "Access denied".
 *
 * -----------------------------------------------------
 */

import java.util.Scanner;

public class InputOutputE
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // * 🚀 Student Exercises:
        // * 1. Ask the user for their first name and last name separately,
        // *    then print: "Hello, FirstName LastName!"
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        System.out.printf("Hello, %s %s!\n", firstName, lastName);
        // * 2. Ask the user to enter two integers and print their sum, difference,
        // *    product, and quotient using System.out.printf for formatting.
        int num1, num2;
        while(true) {
            System.out.print("Enter the first number: ");
            if(scanner.hasNextInt()) {
                num1 = scanner.nextInt();
                break;
            } else {
                System.out.println("Please enter a whole number!");
                scanner.next();
            }
        }
        while(true) {
            System.out.print("Enter the second number: ");
            if(scanner.hasNextInt()) {
                num2 = scanner.nextInt();
                break;
            } else {
                System.out.println("Please enter a whole number!");
                scanner.next();
            }
        }
        System.out.printf("Sum: %d\n", (num1+num2));
        System.out.printf("Difference: %d\n", (num1-num2));
        System.out.printf("Product: %d\n", (num1*num2));
        System.out.printf("Quotient: %d\n", (num1/num2));
        // * 3. Ask the user for the radius of a circle (double) and calculate
        // *    the area (πr²) and circumference (2πr).
        double radius;
        while(true) {
            System.out.print("Enter your circle radius: ");
            if(scanner.hasNextDouble()) {
                radius = scanner.nextDouble();
                break;
            } else {
                System.out.println("Please enter a valid number!");
                scanner.next();
            }
        }
        System.out.printf("Area of circle: %.2f\n",  (Math.PI * (radius*radius)));
        System.out.printf("Circumference of circle: %.2f\n", ((2 * Math.PI) * radius));
        // * 4. Ask the user to enter their age, then print whether they are
        // *    a child (<13), teenager (13–19), or adult (20+).
        int age;
        while(true) {
            System.out.print("Enter your age: ");
            if(scanner.hasNextInt()) {
                age = scanner.nextInt();
                break;
            } else {
                System.out.println("Please enter a whole number!");
                scanner.next();
            }
        }
        if(age >= 20) {
            System.out.println("Adult");
        } else if(age >= 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
        // * 5. Create a simple "login" simulation:
        // *    - Ask the user for a username and password.
        // *    - If username = "admin" and password = "1234",
        // *      print "Access granted".
        // *    - Otherwise, print "Access denied".
        System.out.print("Username: ");
        String username = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();
        if(username.equals("admin") && password.equals("1234")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
        scanner.close();
    }
}
