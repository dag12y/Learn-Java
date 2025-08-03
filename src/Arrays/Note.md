# Arrays in Java

## What is an `Array`?

An `array` in Java is a data structure that holds a fixed number of values of a single type. The size of an array is
determined when the array is created and cannot be changed afterward.

## Creating an `Array`

You can create an array in Java using the following syntax:

``` java
// Declaration and instantiation
int[] numbers = new int[5]; // Creates an array of integers with 5 elements

// Declaration and initialization
String[] fruits = {"Apple", "Banana", "Orange"}; // Creates and initializes an array of strings
```

## Accessing Array Elements

You can access elements in an array using their index (0-based):

``` java
int firstNumber = numbers[0]; // Access the first element
String secondFruit = fruits[1]; // Access the second element
```

## Modifying Array Elements

You can modify elements in an array by assigning a new value to a specific index:

``` java
numbers[0] = 10; // Assigns 10 to the first element of the numbers array
fruits[1] = "Mango"; // Changes "Banana" to "Mango"
```

## Common Operations on Arrays

1. **Length of an Array**

You can get the length of an array using the length property:

``` java
int length = fruits.length; // Gets the number of elements in the fruits array
```

2. **Looping Through an Array**

You can loop through an array using a for loop or an enhanced for loop:

``` java
// Using a traditional for loop
for (int i = 0; i < numbers.length; i++) {
System.out.println(numbers[i]);
}

// Using an enhanced for loop
for (String fruit : fruits) {
System.out.println(fruit);
}
```

3. **Copying Arrays**

You can copy arrays using `System.arraycopy()` or `Arrays.copyOf()`:

``` java
// Using System.arraycopy()
int[] copyNumbers = new int[5];
System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);

// Using Arrays.copyOf()
String[] copiedFruits = Arrays.copyOf(fruits, fruits.length);
```

4. **Sorting Arrays**

You can sort arrays using Arrays.sort():

``` java
Arrays.sort(fruits); // Sorts the fruits array in alphabetical order
```

5. **Searching Arrays**

You can search for an element in a sorted array using Arrays.binarySearch():

``` java
int index = Arrays.binarySearch(fruits, "Mango"); // Returns the index of "Mango" if found, otherwise returns a negative value
```

6. **Filling Arrays**

You can fill an array with a specific value using Arrays.fill():

``` java
Arrays.fill(numbers, 0); // Fills the numbers array with zeros
```

7. **Converting Array to List**

You can convert an array to a List using Arrays.asList():

``` java
List<String> fruitList = Arrays.asList(fruits); // Converts the fruits array to a List
```

## Multi-Dimensional Arrays

Java also supports multi-dimensional arrays (arrays of arrays):

``` java
// Declaration and initialization of a 2D array
int[][] matrix = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};

// Accessing elements in a 2D array
int element = matrix[1][2]; // Accesses the element at row 1, column 2 (value: 6)
```

## Conclusion

Arrays are a fundamental data structure in Java that allow you to store multiple values of the same type. Understanding
how to create, access, and manipulate arrays is essential for effective programming in Java.