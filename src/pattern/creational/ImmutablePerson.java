package pattern.creational;

// Step 1: Declare class as final

/**
 * Steps to Create an Immutable Class
 * To make a class immutable, follow these best practices:
 *
 * Declare the class as final → Prevents subclassing.
 * Make all fields private and final → Fields cannot be modified after initialization.
 * Do not provide setter methods → Prevents modification.
 * Initialize fields via a constructor → Ensures values are assigned once.
 * Return defensive copies of mutable objects → Prevents modification of mutable fields.
 */
public final class ImmutablePerson {
    // Step 2: Make fields private and final
    private final String name;
    private final int age;
    private final Address address; // Mutable object

    // Step 4: Initialize fields in constructor
    public ImmutablePerson(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address); // Step 5: Defensive copy
    }

    // Step 3: No setters, only getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return a defensive copy of mutable object
    public Address getAddress() {
        return new Address(address);
    }

    // Step 6: Override toString() for debugging
    @Override
    public String toString() {
        return "ImmutablePerson{name='" + name + "', age=" + age + ", address=" + address + "}";
    }
}

