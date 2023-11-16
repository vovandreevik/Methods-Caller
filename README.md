# Methods-Caller

This Java program demonstrates a method caller utility that uses Java reflection and annotations to invoke methods with specified repeat counts.

## How it works

1. The program creates an instance of the `MethodsClass` class.
2. It uses reflection to obtain the class of the instance and iterates through its declared methods.
3. If a method is annotated with `@RepeatCount`, the program invokes the method according to the specified repeat count.
4. If the method has parameters, default values are provided based on the parameter types.

## Annotations

### `@RepeatCount`

This annotation is used to specify the number of times a method should be repeated when invoked.

**Example:**

```java
@RepeatCount(repeat = 4)
public void publicMethod(double number) { System.out.println("Public Method: " + number); }
