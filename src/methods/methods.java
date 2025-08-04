package methods;

public class methods {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add two double values (method overloading)
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two integers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0; // Return 0 or handle it as needed
        }
        return (double) a / b;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Calling the methods and displaying results
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition (int): " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        double doubleNum1 = 10.5;
        double doubleNum2 = 5.5;

        System.out.println("Addition (double): " + add(doubleNum1, doubleNum2));
    }
}
