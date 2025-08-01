
# Java Strings and String Methods

## What is a String?
A `String` in Java is an object that represents a sequence of characters. Strings are **immutable**, meaning once created, they cannot be changed.

### Declaring Strings
```java
String name = "Dagm";
String greeting = new String("Hello");
```

## Common String Methods

### 1. `length()`
Returns the length of the string.
```java
String str = "Hello";
int len = str.length(); // 5
```

### 2. `charAt(int index)`
Returns the character at a specific index.
```java
char ch = str.charAt(1); // 'e'
```

### 3. `substring(int beginIndex)` and`substring(int beginIndex, int endIndex)`
Returns a substring starting from or between indices.
```java
String text = "HelloWorld";
String sub1 = text.substring(5);      // "World"
String sub2 = text.substring(0, 5);   // "Hello"
```

### 4. `equals(String another)`
Checks if two strings are equal (case-sensitive).
```java
boolean isEqual = "Hello".equals("hello"); // false
```

### 5. `equalsIgnoreCase(String another)`
Checks if two strings are equal (ignoring case).
```java
boolean isEqual = "Hello".equalsIgnoreCase("hello"); // true
```

### 6. `toLowerCase()` / `toUpperCase()`
Converts all characters to lower/upper case.
```java
String lower = "HELLO".toLowerCase(); // "hello"
String upper = "hello".toUpperCase(); // "HELLO"
```

### 7. `contains(CharSequence s)`
Checks if the string contains the specified sequence.
```java
boolean result = "Hello".contains("ell"); // true
```

### 8. `replace(char oldChar, char newChar)`
Replaces all occurrences of a character with another.
```java
String newStr = "hello".replace('l', 'x'); // "hexxo"
```

### 9. `trim()`
Removes whitespace from both ends of the string.
```java
String trimmed = "  hello  ".trim(); // "hello"
```

### 10. `split(String regex)`
Splits the string into an array based on a regex.
```java
String sentence = "Java is fun";
String[] words = sentence.split(" "); // ["Java", "is", "fun"]
```

### 11. `indexOf(String str)` and `lastIndexOf(String str)`
Returns the index of the first/last occurrence of a substring.
```java
int first = "hello".indexOf("l");      // 2
int last = "hello".lastIndexOf("l");   // 3
```

### 12. `startsWith(String prefix)` / `endsWith(String suffix)`
Checks if the string starts/ends with the specified string.
```java
boolean starts = "hello".startsWith("he"); // true
boolean ends = "hello".endsWith("lo");     // true
```

## Summary Table

| Method | Description |
|--------|-------------|
| `length()` | Get number of characters |
| `charAt(i)` | Character at index `i` |
| `substring(start, end)` | Substring from `start` to `end-1` |
| `equals()` | Check for exact match |
| `equalsIgnoreCase()` | Case-insensitive match |
| `toLowerCase()` / `toUpperCase()` | Change case |
| `contains()` | Check for substring |
| `replace()` | Replace characters |
| `trim()` | Remove whitespace |
| `split()` | Split by delimiter |
| `indexOf()` / `lastIndexOf()` | Find positions |
| `startsWith()` / `endsWith()` | Prefix/suffix check |
