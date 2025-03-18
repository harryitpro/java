package basic.inheritance;

public class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    /**
     * this method is still a VALID override, although it has no @Override, and not throw exception.
     * the rule is they should have the same method name, parameter and return data type.
     */
    void show() {
        System.out.println("Child method");
    }

    public static void main(String[] args) throws Exception {
        Parent p = new Child();
        p.show();  //Child method.
    }
}
