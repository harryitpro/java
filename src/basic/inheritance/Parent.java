package basic.inheritance;

public class Parent {
    private String firstName;

    public Parent(String name) {
        this.firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    void show() throws Exception {
        System.out.println("Parent method");
    }
}
