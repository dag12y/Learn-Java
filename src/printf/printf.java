package printf;

/*

 *
 * The printf() method is used to print formatted output in Java.
 * Syntax:
 *    System.out.printf(String format, Object... args);
 *
 * Common Format Specifiers:
 *   %s - String
 *   %d - Decimal integer
 *   %f - Floating-point number
 *   %.2f - Floating-point with 2 decimal places
 *   %-10s - Left-aligned string in 10-character field
 *   %10d - Right-aligned integer in 10-character field
 */

public class printf {
    public static void main(String[] args) {

        // 1. Print a string
        System.out.printf("Hello, %s!\n", "Dagm");
        // Output: Hello, Dagm!

        // 2. Print an integer
        int score = 100;
        System.out.printf("Your score is: %d\n", score);
        // Output: Your score is: 100

        // 3. Print a float with 2 decimal places
        double pi = 3.14159;
        System.out.printf("Pi is approximately %.2f\n", pi);
        // Output: Pi is approximately 3.14

        // 4. Print multiple values
        String name = "Alice";
        int age = 21;
        System.out.printf("%s is %d years old.\n", name, age);
        // Output: Alice is 21 years old.

        // 5. Align text using width
        System.out.printf("|%-10s|%10d|\n", "Apples", 25);
        // Output: |Apples    |        25|

        // 6. Format currency
        double price = 19.99;
        System.out.printf("Price: $%.2f\n", price);
        // Output: Price: $19.99
    }
}

