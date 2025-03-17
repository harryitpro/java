package basic.inheritance;

/**
 * In Java, a method signature is a combination of the method's name and its parameter list (including the number, types, and order of parameters). It uniquely identifies a method within a class or interface. The method signature is a critical concept in Java, especially in the context of method overloading, method overriding, and method resolution.
 *
 * Components of a Method Signature
 * A method signature consists of the following two parts:
 *
 * Method Name: The name of the method.
 * Parameter List: The list of parameters, including:
 * The number of parameters.
 * The types of the parameters.
 * The order of the parameters.
 * What is Not Included in a Method Signature
 * The following are not part of a method signature in Java:
 *
 * Return Type: The return type of a method is not considered part of the signature.
 * Access Modifiers: Modifiers like public, private, protected, or default are not part of the signature.
 * Exception Clause: The throws clause (if any) is not part of the signature.
 * Parameter Names: Only the types and order of parameters matter, not their names.
 * Annotations: Annotations like @Override are not part of the signature.
 * Method Body: The implementation of the method is not part of the signature.
 * Why is Method Signature Important?
 * The method signature is used by the Java compiler and runtime to:
 *
 * Distinguish Between Methods: In method overloading, methods in the same class can have the same name but must have different signatures (i.e., different parameter lists).
 * Enable Method Overriding: In method overriding, the child class method must have the exact same signature as the parent class method to override it.
 * Resolve Method Calls: The Java runtime uses the method signature to determine which method to invoke when a method is called.
 * Examples of Method Signatures
 * Example 1: Basic Method Signatures
 * Consider the following methods in a class:
 *
 * java
 *
 * Collapse
 *
 * Wrap
 *
 * Copy
 * public class Example {
 *     public void doSomething(int x) { }
 *     public void doSomething(String s) { }
 *     public void doSomething(int x, double y) { }
 * }
 * In this example, the method signatures are:
 *
 * doSomething(int)
 * doSomething(String)
 * doSomething(int, double)
 * These methods are overloaded because they have the same name but different parameter lists (different signatures).
 *
 * Example 2: Method Signature in Overriding
 * For a method to be overridden, the child class method must have the exact same signature as the parent class method:
 *
 * java
 *
 * Collapse
 *
 * Wrap
 *
 * Copy
 * class Parent {
 *     public void display(String message) { }
 * }
 *
 * class Child extends Parent {
 *     @Override
 *     public void display(String message) { } // Same signature: display(String)
 * }
 * Here, the method signature display(String) is identical in both the parent and child classes, allowing for overriding.
 *
 * Example 3: What is Not Part of the Signature
 * Consider the following methods:
 *
 * java
 *
 * Collapse
 *
 * Wrap
 *
 * Copy
 * public class Example {
 *     public int doSomething(int x) { return x; }
 *     public void doSomething(int x) { }
 * }
 * In this case, the methods have the same signature doSomething(int) because the return type is not part of the signature. This will result in a compilation error because Java does not allow two methods with the same signature but different return types in the same class.
 *
 * Example 4: Parameter Names vs. Types
 * Parameter names are not part of the signature, only their types and order matter:
 *
 * java
 *
 * Collapse
 *
 * Wrap
 *
 * Copy
 * public class Example {
 *     public void doSomething(int x) { }
 *     public void doSomething(int y) { } // Compilation error: same signature
 * }
 * Here, both methods have the same signature doSomething(int) because the parameter name (x vs. y) is irrelevant. This will cause a compilation error due to duplicate methods.
 *
 * Formal Definition (Java Language Specification)
 * According to the Java Language Specification (JLS), a method signature is formally defined as:
 *
 * The method name.
 * The number, types, and order of its parameters.
 * For example, the JLS states that two methods have the same signature if they have the same name and parameter types, regardless of return type, modifiers, or other attributes.
 *
 * Practical Implications
 * Method Overloading: You can define multiple methods with the same name in a class as long as their signatures are different (i.e., different parameter lists).
 * java
 *
 * Collapse
 *
 * Wrap
 *
 * Copy
 * public class Example {
 *     public void process(int x) { }
 *     public void process(String s) { }
 *     public void process(int x, double y) { }
 * }
 * These methods are valid because their signatures are distinct.
 * Method Overriding: When overriding a method in a subclass, the method signature must match exactly, though the return type can be a subtype (covariant return type) in Java 5 and later.
 * java
 *
 * Collapse
 *
 * Wrap
 *
 * Copy
 * class Parent {
 *     public Number getValue() { return 42; }
 * }
 *
 * class Child extends Parent {
 *     @Override
 *     public Integer getValue() { return 42; } // Valid: covariant return type
 * }
 * Ambiguity in Method Resolution: If method signatures are not distinct, it can lead to ambiguity or compilation errors, especially in method overloading scenarios.
 * Conclusion
 * In Java, a method signature is the combination of the method name and its parameter list (types, number, and order). It is a crucial concept for method overloading, overriding, and resolving method calls. Understanding what is and isn’t part of the signature helps in writing correct and efficient Java code.
 */
public class Signature {
}
