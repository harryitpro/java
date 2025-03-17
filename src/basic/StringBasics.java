package basic;


/**
 * String object is immutable.
 * string instance method:
 * concat()  --> generate a new String instance. keep existing instance unchanged.
 * equals()  : compare value. different than ==, which compare reference
 */
public class StringBasics {

    /**
     * String is Immutable!
     */
    public static void stringIsImmutable() {
        String str = "Hello";
        String newString = str.concat(" World");
        System.out.println(str); //Hello
        System.out.println(newString); //Hello World

    }

    static void stringEquals() {
        String str1 = "Hello";
        String str2 = new String("Hello");  //new instance, will be difference reference
        System.out.println(str1 == str2);  //false
        System.out.println(str1.equals(str2)); //true/ check value
    }


    /**
     * StringBuilder is mutable
     */
    static void stringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); //Hello World
    }

    public static void main(String[] args) {
        stringIsImmutable();
        stringBuilder();
        stringEquals();
    }
}
