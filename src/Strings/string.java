package Strings;

public class string {
    public static void main(String[] args) {
        // 1. length()
        String str = "Hello";
        System.out.println("Length: " + str.length()); // 5

        // 2. charAt()
        System.out.println("Character at index 1: " + str.charAt(1)); // 'e'

        // 3. substring()
        String text = "HelloWorld";
        System.out.println("Substring from index 5: " + text.substring(5));     // "World"
        System.out.println("Substring from 0 to 5: " + text.substring(0, 5));   // "Hello"

        // 4. equals()
        System.out.println("Equals: " + "Hello".equals("hello")); // false

        // 5. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + "Hello".equalsIgnoreCase("hello")); // true

        // 6. toLowerCase() and toUpperCase()
        System.out.println("To Lower: " + "HELLO".toLowerCase()); // "hello"
        System.out.println("To Upper: " + "hello".toUpperCase()); // "HELLO"

        // 7. contains()
        System.out.println("Contains 'ell': " + "Hello".contains("ell")); // true

        // 8. replace()
        System.out.println("Replace 'l' with 'x': " + "hello".replace('l', 'x')); // "hexxo"

        // 9. trim()
        System.out.println("Trimmed: '" + "  hello  ".trim() + "'"); // "hello"

        // 10. split()
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println("Word: " + word); // "Java", "is", "fun"
        }

        // 11. indexOf() and lastIndexOf()
        System.out.println("First index of 'l': " + "hello".indexOf("l"));    // 2
        System.out.println("Last index of 'l': " + "hello".lastIndexOf("l")); // 3

        // 12. startsWith() and endsWith()
        System.out.println("Starts with 'he': " + "hello".startsWith("he")); // true
        System.out.println("Ends with 'lo': " + "hello".endsWith("lo"));     // true
    }
}