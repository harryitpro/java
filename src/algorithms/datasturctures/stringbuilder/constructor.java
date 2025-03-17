package algorithms.datasturctures.stringbuilder;

public class constructor {
    static StringBuilder fromString(String s) {
        return new StringBuilder(s);
    }

    static StringBuilder fromCharArray(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            stringBuilder.append(c);
        }
        return stringBuilder;
    }

}
