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

# 4. For Loops - Factorials.java
## 4.1. Shortcuts
A quick idea of how to do shortcuts.

Python allows for shortcuts like `+=`, `-=`, etc...

Java has the same shortcut operators and also two other ones. Let's say `x` is our variable:
- `x++`: adds 1
- `x--`: subtracts 1

The ones equal to Python:
- `+=`
- `-=`
- `*=`
- `/=`

```java
int result = 2;
int n = 5;
result *= n;
n += 1;
```

Or:

```java
int result = 2;
int n = 5;
result *= n;
n++;
```

## 4,2, Into For Loops
```java
public class Factorials {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + fac(n));
    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            int result = 1;
            for (int x = 2; x <= n; x++) {
                result *= x;
            }
            return result;
        }
    }
}
```

The for loop has:

```
for (initialization; continuation-test; update) {
    body
}
```

- The initialization is only done once.
- If the test is false, the for loop is over.
- We update the for loop.

```java
for (int x = 2; x <= n; x++) {
    result *= x;
}
```

# 5. Variable Scope - VariableScope.java
The scope of a variable is the portion of a program in which the variable can be used.

By default, the scope a variable in Java:
- begins at the point at which it is declared.
- ends at the end of the innermost block that encloses the declaration.

```java
public class VariableScope {
    public static void printResults(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        double avg = sum / 2.0;
        System.out.println("Average: " + avg);
    }
}
```

For instance, the `sum` and the `avg` can only be used here inside `printResult`.

The scope of `a` and `b` are also important: the parameters in this case, are out of the innermost block of `printResults`. The innermost block for the parameters is the class `VariableScope`.

The special case is for "for loops"! In the following case the scope of `i` is only inside the for loop! It is an exception.

```java
public static void myMethod() {
    for (int i = 0; i < 5; i++) {
        int j = i * 3
        System.out.println(j);
    }
}
```

We cannot print `i` outside the loop.

If we want to be able to use `i` outside the loop, we need to declare it outside the loop:

```java
int i;
public static void myMethod() {
    for (i < 5; i++) {
        int j = i * 3
        System.out.println(j);
    }
}
```

In this way, we do not have a initialization in the for loop, but outside.

# 6. Primitives, Objects and References
In Python, when we assign a value to a variable, we are not actually storing the value in the variable.
- The value is somewhere else in the memory.
- The variable stores the memory address of the value.

We say that a variable stores a reference to its value (also known as a pointer).

In Python, when a variable represents certain types of values:
- integers
- floats
- strings
- other immutable (unchangeable) values
It is okay to picture the value as being inside the variable (as a simplification).

In Java, some types of data are actually stored inside the variables (not a simplification).
For instance, `int`'s are stored inside the variable.

Those kinds of variables are referred to as primitive types.

Those data types that are stored inside the variables are known as primitive types. Those are:
- `int`
- `long`
- `double`
- `boolean`
- a few others

In Java, if something is not a primitive, it is an Object.

An object is a construct that groups together:
- one or more data values (the object's attributes or fields)
- one or more functions (known as the object's methods)

For instance, `string`'s are objects, which have the contents of the string, the length of the string, the methods associated with it.

Every object is an instance of a class: `string` objects are an instance of the string class.

In Python everything is an object. In Java, primitive values are not objects:
- they are just "single" values
- there is nothing else grouped with the value

Java stores objects in the same way that Python does. Data types that work this way in Java are known as reference types (variables of those types are reference variables).
- the object is stored outside the variable.
- the variable stores a reference to the object.

## 6.1. Why do we need to declare variables in Java?
- Primitives are stored inside variables
- Different primitive values require different amount of memory

- int: 4 bytes
- double: 8 bytes
- long: 8 bytes
- boolean: 1 byte

Declaring a variable tells the compiler how much memory to allocate!

For instance, 4 (four) bytes will be allocated to `count`:
```java
int count = 1;
```

In Python, everything is object and therefore, every variable is holding a memory address (references) with the same size. What is inside the variable is always the memory address.

# 7. Working with Strings
- The `char`type is a primitive type.
- To specify the `char` literal we surround the character by single quotes:

Examples: `'a'`, `'Z'`, `'0'`, `'7'`, etc...

Sorrounding with single quotes a string bigger than one in length is going to give an error.

Sorrounding a string with a double quote will give a `string` type (which is not a primitive).

## 7.1. Comparing Strings - WorkingWithStrings.java
```java
public class WorkingWithStrings {
    
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world!";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        int numChars = s3.length();
        System.out.println("The string s3 has " + numChars + " characters.");
        s2 = s3.substring(0, 5) + s3.charAt(numChars - 1);
        System.out.println(s2);
        String s4 = s2.toUpperCase();
        System.out.println(s4);
    }
}
```

The `charAt` is used to get the char in a specific place.
- In this case, we take the last character of the string.
- We use the number of characters - 1, because the index starts at 0.
- There is no `-1` in Java and that is why we use `numChars - 1`.

The `substring` method is going to give us an arbitrary string.

# 8. Lists/Arrays - ArrayExamples.java
Arrays are Java's equivalent of Python's list. Nonetheless, arrays are different because:
- All the elements within an array must have the same type
- Have less built-in functionalities
- Have less overhead and it is easier to use them efficiently

We also have to declare arrays. For instance, declaring that `temps` is an array of `int` is done with:

```java
int[] temps;
```

Some functionalities can be found here:
```java
public class ArrayExamples {
    public static void main(String[] args) {
        int[] temps = {51, 50, 36, 29, 30};
        int first = temps[0];
        System.out.println("The first temperature is " + first);
        int numTemps = temps.length;
        int last = temps[numTemps - 1];
        System.out.println("The last temperature is " + last);

        // Assign new values of elements in the array
        temps[2] = 40;
        System.out.println("New temps[2]: " + temps[2]);
        System.out.println("Old temps[3]: " + temps[3]);
        temps[3] += 5;
        System.out.println("New temps[3]: " + temps[3]);
    }
}
```

With array, `length` is an attribute, because the `temps.length` is a variable.
This is different from a string because in the string the `length` is a method.

In Java, printing a list would not show the values of the array.

That is because the array is an object and the variable is not storing the array itself but actually memory address (reference to the array). When we print an array, we will se a value that is the reference of the array:

```java
System.out.println(temps);
```
Gives for instance:
```
[I@c387f44
```

We have to pass the array to string, which is a non-static method:

```java
System.out.println(Arrays.toString(temps));
```

Which is part of the util packages:
```java
import java.util.Arrays;
```

```java
import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] temps = {51, 50, 36, 29, 30};
        int first = temps[0];
        System.out.println("The first temperature is " + first);
        int numTemps = temps.length;
        int last = temps[numTemps - 1];
        System.out.println("The last temperature is " + last);

        // Assign new values of elements in the array
        temps[2] = 40;
        System.out.println("New temps[2]: " + temps[2]);
        System.out.println("Old temps[3]: " + temps[3]);
        temps[3] += 5;
        System.out.println("New temps[3]: " + temps[3]);
        System.out.println(temps);
        System.out.println("Print array properly:");
        System.out.println(Arrays.toString(temps));
    }
}
```

# 9. Array Functionalities - ArrayFunctionalities.java
Arrays are way more similar than Python lists in terms of functionalities.

One of the functionalities present in array is the slicing of an array:

```java
Arrays.copyOfRange(values, start, end)
```

For more complex and a bigger variety of functionalities, we can use built-in collection classes for lists.
- They can used instead of an array.
- Objects of these classes have non-static methods (methods inside them) for a list operations.

## 9.1. Create Arrays - ArrayCreationTypes.java
The way to create an array in Java that later will get the values is to specify its size prior to creating it:
```java
import java.util.Arrays;

public class ArrayCreationTypes {
    public static void main(String[] args) {
        int[] temps = new int[4];
        System.out.println(Arrays.toString(temps));
        double[] vals = new double[100];
        System.out.println(Arrays.toString(vals));
        String[] names = new String[10];
        System.out.println(Arrays.toString(names));
        boolean[] flags = new boolean[8];
        System.out.println(Arrays.toString(flags));
    }
}
```

When we create it, the values in the array will be the default values for that type.

For instance, in the previous example, printing the array would generate:

```java
[0, 0, 0, 0]
[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
[null, null, null, null, null, null, null, null, null, null]
[false, false, false, false, false, false, false, false]
```

## 9.2. Prompt Array - ArrayPrompt.java
Now, let's fill the arrays with value using inputs:
```java
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrompt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] temps = new int[4];
        System.out.println("Enter 4 temperatures: ");
        temps[0] = scan.nextInt();
        temps[1] = scan.nextInt();
        temps[2] = scan.nextInt();
        temps[3] = scan.nextInt();
        System.out.println(Arrays.toString(temps));
    }
}
```

```
Enter 4 temperatures: 
1
2
3
4
[1, 2, 3, 4]
```

# 9.3. For Loops with Arrays - BigArrayPrompt.java
We can use a for loop to get the input for 100 positions, for instance:

```java
import java.util.Arrays;
import java.util.Scanner;

public class BigArrayPrompt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] temps = new int[100];
        System.out.println("Enter 100 temperatures: ");
        for (int i = 0; i < temps.length; i++) {
            temps[i] = scan.nextInt();
            System.out.println(Arrays.toString(temps));
        }
    }
}
```

## 9.4. Element Base Loop
We can do for loops in Python with elements of a list. For instance:

```python
for val in list_vals:
    print(val)
```

In Java, the equivalent would be:
```java
for (int val: array){
    // do something with val
}
```

We do not initialize! It will do the same thing as the Python one.

# 10. Writing Class - Rectangle.java & RectangleClient.java
A class is a blueprint is a definition of a data type.
- it specifies the data values and methods of that type.
- objects are built according to the blueprint provided by their class (they are instances of that type).

Creating a class Rectangle class in Python:

```python
class Rectangle:
    def __init__(self, w, h):
        self.width = w
        self.height = h
```

```java
public class Rectangle {
    int width;
    int height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }
}
```

In Java:
- the Rectangle has to be inside the `Rectangle.java` file.
- the `__init__` constructor in Python is the `public Rectangle` constructor in Java. The constructor has to have the same name as the class.
- The `self` in Python is the `this` in Java. The `this` does not appear in the parameter list.
- The construtor is not static.
- There is no return type (not even `void`)! This is the only case in which a method in Java has no returning type.
- In Java, we have to declare our fields prior to the constructor.
- The Class we are building is just a blueprint because it does not have a main method and it will be used by a Client Program that will take this class and use it (this other class will have a main method).

When we use the `RectangleClient.java`, we assign the new rectangle in a way that the variable has a reference to the memory (since rectangle is an object and not a primitive instance):

```java
Rectangle r = new Rectangle(3, 4);
```

```java
public class Rectangle {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public String sizes() {
        return "Height: " + this.height + ", Width: " + this.width;
    }
}
```

```java
public class RectangleClient {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);
        System.out.println(r.sizes());
        System.out.println("Area: " + r.getArea());

        r.width += 50;
        r.height = 5;

        System.out.println(r.sizes());
        System.out.println("Area: " + r.getArea());
    }
}
```