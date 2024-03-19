# Java Studies
# 1. Conveting a Simple Program - ChangeAdder.java
Everything in Java has to be inside a class.

- Every class has to have at least one method called `main`.
- Every line has to have a `;` in the end.
- `System.out.println` is the `print` for a specific line of output.
- String have to be sorrounded by double quotes.
- Contatenation is necessary to join the values of a print statement.
- print will automatically convert to string.
- The class name has to be used as the name of the file! (in this case `ChangeAdder`)

```java
public class ChangeAdder {
    public static void main(String[] args) {
        int pennies = 3;
        int nickels = 4;
        int dimes = 5;
        int quarters = 6;
        int totalCents = pennies + 5 * nickels + 10 * dimes + 25 * quarters;
        System.out.println("Total: " + totalCents + " cents");
    }
}
```

Before you use a variable for the first time in Java, you have to declare it. You have to precede the name of the variable with its type:

```
type variable
```

For instance:

```java
int pennies = 3;
```

Or it can be done without assigning an initial value:

```java
int pennies;
pennies = 3;
```

# 2. Conditional Execution and User Input - LetterGrade.java
- steady of `elif` we use `else if`.
- We define the `String grade` before assigning any value to it.

```java
public class LetterGrade {
    public static void main(String[] args) {
        int avg = 85;
        String grade;

        if (avg >= 90) { 
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Letter Grade: " + grade);
    }
}
```

Now, how to put a input in this kind of code?

## 2.1. User Input - LetterGradeInput.java

For that, we need to add a `Scanner`:

```java
Scanner scan = new Scanner(System.in);
```

We are declaring the type as `Scanner`.

Furthermore, we have to also add the following:

```java
System.out.println("Enter the average: ");
int avg = scan.nextInt();
```

We also have the scan of other types:
- `scan.nextDouble()`
- `scan.next()`: read a single 'word' and return it as a `String`.
- `scan.nextLine()`: read a bunch of words and return it as a `String`.

For this kind of code, we need to import the util package:

```java
import java.util.Scanner;
```

```java
import java.util.Scanner;

public class LetterGradeInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the average: ");
        int avg = scan.nextInt();

        String grade;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Letter Grade: " + grade);
    }
}
```

If we use `System.out.println("Enter the average: ");` it shows the input box in a new line.
If we use `System.out.print("Enter the average: ");` it shows the input box in the same line.

# 3. Functions/Methods - LetterGradeStaticMethod.java
Java only has methods because everything is inside classes.

In Java, there are two types of functions:
- static methods: like Python functions.
- non-static or instance methods: like Python methods.

Generally, the static methods begin with something like:

```java
public static String grade(int avg)
```

- The `String` is the type of value that the method is returning.
- the parameters are always precedeed by their type.

In the previous video, everything was inside the main method, now we are going to change to a separate method.

```java
import java.util.Scanner;

public class LetterGradeStaticMethod {
    public static String grade(int avg){
        String grade;
        // it is okay to have the same name for the method and the variable
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the average: ");
        int avg = scan.nextInt();
        System.out.println("Letter Grade: " + grade(avg));
    }
}
```

Now we have a static method and the main method, which is also a static method.

The main method does not return anything. When we have a method that does not return anything, we have to use the special keywork `void`, which indicates that nothing is being returned.


