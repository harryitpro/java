package algorithms.string.basic;

/**
 * List of Common Static Methods in String Class
 * Method	Description
 * String.valueOf(anyType)	Converts various data types to a String.
 * String.valueOf(charArray, offset, length)	Converts part of a char array to a String.
 * String.format(format, args...)	Returns a formatted string (like printf).
 * String.join(delimiter, elements...)	Joins multiple strings with a delimiter.
 * String.copyValueOf(charArray)	Converts a char array to a String.
 * String.copyValueOf(charArray, offset, length)	Converts part of a char array to a String.
 * <p>
 * <p>
 * Instance methods
 */
public class StringInit {

    //String constructor with char array argument
    static void convertCharArrayToString() {
        char[] chars = {'a', 'b'};

        String s1 = new String(chars); //ab
        String s2 = String.valueOf(chars); //ab
        System.out.println("s1.equals(s2) ? " + s1.equals(s2)); //true
    }


    public static void main(String[] args) {
        convertCharArrayToString();
    }
}
