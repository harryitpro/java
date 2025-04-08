package algorithms.fundamental;

import java.util.Arrays;

/**
 * To count occurrences of a keyword in an article (text)
 * return counter
 */
public class KeywordCounter {
    private static String nonWordExpression = "\\W+";

    /**
     * Uses regular expressions (\W+ or \b\w+\b) to split text into words.
     * Case-insensitive comparison (equalsIgnoreCase(), ignoreCase = true, .lower()).
     */
    public static int countKeyword(String article, String key) {
        String[] words = article.split(nonWordExpression);
        return (int) Arrays.stream(words).filter(word -> word.equalsIgnoreCase(key)).count();
    }

    public static void main(String[] args) {
        String article = "This is a practice string of abc abc and cba, count how many abcs inside it";
        System.out.println(countKeyword(article, "ABC"));  //expecting 2
    }
}
