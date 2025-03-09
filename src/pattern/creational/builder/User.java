package pattern.creational.builder;

// Class with many fields
// use Builder pattern to build a User instance.
class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int age;

    // Private constructor
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
    }
    // Static nested Builder class
    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private int age;

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


    //verify
    public static void main(String[] args) {
        // Using the builder
        User user = new User.UserBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setEmail("john.doe@example.com")
                .setAge(30)
                .build();
        System.out.println(user.age); //30
    }
}



