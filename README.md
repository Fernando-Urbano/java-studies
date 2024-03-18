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




