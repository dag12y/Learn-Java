package loops;

public class loop {
    public static void main(String[] args) {

        // 1. Print numbers from 1 to 10 using a for loop
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Newline

        // 2. Calculate sum of first 10 natural numbers using a while loop
        int sum = 0, i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // 3. Print even numbers between 1 and 20 using a for loop and continue
        System.out.println("Even numbers between 1 and 20:");
        for (int j = 1; j <= 20; j++) {
            if (j % 2 != 0) continue;
            System.out.print(j + " ");
        }
        System.out.println();

        // 4. Use break to stop loop when number is greater than 5
        System.out.println("Break when number > 5:");
        for (int j = 1; j <= 10; j++) {
            if (j > 5) break;
            System.out.print(j + " ");
        }
        System.out.println();

        // 5. Print elements of an array using for-each loop
        int[] numbers = {5, 10, 15, 20};
        System.out.println("Elements of the array:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 6. Print multiplication table of 5 using do-while loop
        int n = 1;
        System.out.println("Multiplication table of 5:");
        do {
            System.out.println("5 x " + n + " = " + (5 * n));
            n++;
        } while (n <= 10);
    }
}
