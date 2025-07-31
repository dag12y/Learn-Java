package ifStatement;

public class ifStatement {
    public static void main(String[] args) {

        int score = 75;
        System.out.println("Score: " + score);
        if (score >= 60) {
            System.out.println("You passed the exam!");
        }
        System.out.println();

        int temperature = 25;
        System.out.println("Temperature: " + temperature + "°C");
        if (temperature > 30) {
            System.out.println("It's a hot day!");
        } else {
            System.out.println("It's a pleasant day.");
        }

        System.out.println();

        int grade = 85;
        System.out.println("Grade: " + grade);
        if (grade >= 90) {
            System.out.println("Result: Grade A");
        } else if (grade >= 80) {
            System.out.println("Result: Grade B");
        } else if (grade >= 70) {
            System.out.println("Result: Grade C");
        } else if (grade >= 60) {
            System.out.println("Result: Grade D");
        } else {
            System.out.println("Result: Grade F");
        }

        System.out.println();

        boolean isLoggedIn = true;
        String userRole = "admin";

        System.out.println("Is Logged In: " + isLoggedIn + ", User Role: " + userRole);
        if (isLoggedIn) {
            System.out.println("User is logged in.");
            if (userRole.equals("admin")) {
                System.out.println("Welcome, Administrator!");
            } else {
                System.out.println("Welcome, User!");
            }
        } else {
            System.out.println("Please log in to access the system.");
        }

        System.out.println();

        isLoggedIn = true;
        userRole = "guest";
        System.out.println("Is Logged In: " + isLoggedIn + ", User Role: " + userRole);
        if (isLoggedIn) {
            System.out.println("User is logged in.");
            if (userRole.equals("admin")) {
                System.out.println("Welcome, Administrator!");
            } else {
                System.out.println("Welcome, User!");
            }
        } else {
            System.out.println("Please log in to access the system.");
        }

        System.out.println();

        isLoggedIn = false;
        System.out.println("Is Logged In: " + isLoggedIn + ", User Role: " + userRole);
        if (isLoggedIn) {
            System.out.println("User is logged in.");
            if (userRole.equals("admin")) {
                System.out.println("Welcome, Administrator!");
            } else {
                System.out.println("Welcome, User!");
            }
        } else {
            System.out.println("Please log in to access the system.");
        }
        System.out.println();

        int age = 20;
        boolean hasLicense = true;

        age = 16;
        hasLicense = true;
        System.out.println("Age: " + age + ", Has License: " + hasLicense);
        if (age >= 18 && hasLicense) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }
    }
}
