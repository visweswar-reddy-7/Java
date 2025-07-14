README.md


## 🧱 1. Variables and Data Types

Java is statically typed, so every variable must have a declared type.

### ✳️ Basic Data Types

| Type     | Example                                        |
|----------|------------------------------------------------|
| `int`    | `int age = 25;`                                |
| `double` | `double pi = 3.14;`                            |
| `char`   | `char grade = 'A';`                            |
| `boolean`| `boolean isOpen = true;`                       |
| `String` | `String name = "John";` (not a primitive type) |

---


---

### 👀 How It Will Look Rendered:

## 🔄 2. Conditionals

### ✅ if-else Example:
```java
 int age = 20;
 if (age >= 18) {
     System.out.println("You are an adult.");
 } else {
     System.out.println("You are a minor.");
 }
```

### ✅ switch Example:
```java
 int day = 3;
 switch (day) {
     case 1: System.out.println("Monday"); break;
     case 2: System.out.println("Tuesday"); break;
     case 3: System.out.println("Wednesday"); break;
     default: System.out.println("Another day");
 }
```

## 🔁 3. Loops

### ✅ for loop:
```java
 for (int i = 1; i <= 5; i++) {
     System.out.println("Count: " + i);
 }
```

### ✅ while loop:
```java
 int i = 1;
 while (i <= 5) {
     System.out.println("While count: " + i);
     i++;
 }
```

## 🧮 4. Functions (Methods)

A method is a reusable block of code.

### ✅ Example:
```java
public class Functions {
    // Method definition
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(10, 20); // Call the method
        System.out.println("Sum: " + sum);
    }
}
```

---




