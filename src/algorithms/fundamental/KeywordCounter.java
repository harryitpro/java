package algorithms.fundamental;

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
    public static int countKeyword(String article, String keyword) {
        int count = 0;
        //the non-word regular expression is "\\W+"
        String[] words = article.split(nonWordExpression);
        for (String word : words) {
            if (word.equalsIgnoreCase(keyword)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String article = "This is a practice string of abc abc and cba, count how many abcs inside it";
        System.out.println(countKeyword(article, "ABC"));  //expecting 2
    }
}
