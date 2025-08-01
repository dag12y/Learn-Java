
# Java Loops

Loops in Java are used to execute a block of code repeatedly under certain conditions.

## Types of Loops

### 1. `for` loop
Used when the number of iterations is known.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

### 2. `while` loop
Used when the number of iterations is not known and depends on a condition.

```java
int i = 0;
while (i < 5) {
    System.out.println("i = " + i);
    i++;
}
```

### 3. `do-while` loop
Similar to `while`, but it runs at least once.

```java
int i = 0;
do {
    System.out.println("i = " + i);
    i++;
} while (i < 5);
```

## Loop Control Statements

### `break`
Exits the loop early.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;
    System.out.println("i = " + i);
}
```

### `continue`
Skips the current iteration.

```java
for (int i = 0; i < 5; i++) {
    if (i == 2) continue;
    System.out.println("i = " + i);
}
```

## Enhanced `for-each` loop
Used for iterating over arrays or collections.

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```

---

## Summary

| Loop Type | Best Use |
|-----------|----------|
| `for` | When the number of iterations is known |
| `while` | When the condition depends on runtime |
| `do-while` | When the loop must run at least once |
| `for-each` | When looping through arrays/collections |

