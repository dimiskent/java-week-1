/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable num = 8.
 *    - Apply unary minus and print the result.
 *    - Apply unary plus and print the result.
 *
 * 2. Create a boolean variable isOpen = false.
 *    - Use logical NOT (!) to invert its value and print it.
 *
 * 3. Create an int variable counter = 0.
 *    - Use pre-increment (++counter) and print the value.
 *    - Use post-increment (counter++) and print the value.
 *
 * 4. Create an int variable count = 5.
 *    - Use pre-decrement (--count) and print the value.
 *    - Use post-decrement (count--) and print the value.
 *
 * Bonus:
 * 5. Combine unary operators with arithmetic:
 *    Example: int x = 10; int y = -x + ++x; print y and explain.
 * -------------------------------------------------------------
 */

public class UnaryE
{
    public static void main(String[] args) {
        // -------------------- Student Exercises --------------------
        // 1. Create int num = 8; apply unary minus and plus.
        int num = 8;
        System.out.println(num);
        System.out.println(-num);
        System.out.println(+num);
        // 2. Create boolean isOpen = false; invert it with !.
        boolean isOpen = false;
        System.out.println(isOpen);
        isOpen = !isOpen;
        System.out.println(isOpen);
        // 3. Create int counter = 0; use pre-increment and post-increment.
        int counter = 0;
        System.out.println(counter);
        int counter2 = ++counter;
        System.out.println(counter);
        System.out.println(counter2);
        int counter3 = counter++;
        System.out.println(counter);
        System.out.println(counter3);
        // 4. Create int count = 5; use pre-
        int count = 5;
        --count;
        System.out.println(count);
        ++count;
        System.out.println(count);

    }
}