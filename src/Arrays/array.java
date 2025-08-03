package Arrays;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        // Step 1: Create and initialize an array of integers
        int[] numbers = {5, 2, 8, 3, 1};

        // Step 2: Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Step 3: Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Step 4: Search for a number in the sorted array
        int searchNumber = 3;
        int index = Arrays.binarySearch(numbers, searchNumber);
        if (index >= 0) {
            System.out.println("Number " + searchNumber + " found at index: " + index);
        } else {
            System.out.println("Number " + searchNumber + " not found.");
        }

        // Step 5: Fill the array with a specific value
        Arrays.fill(numbers, 0);
        System.out.println("Array after filling with zeros: " + Arrays.toString(numbers));

        // Step 6: Re-initialize the array with new values
        numbers = new int[]{7, 4, 9, 6, 2};
        System.out.println("New array: " + Arrays.toString(numbers));

        // Step 7: Sort the new array
        Arrays.sort(numbers);
        System.out.println("Sorted new array: " + Arrays.toString(numbers));
    }
}

