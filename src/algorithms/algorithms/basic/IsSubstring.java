package algorithms.algorithms.basic;

public class IsSubstring {
    static boolean isSubstring(String mainString, String subString) {
        /**
         * HINT: a substring should be smaller or equals to main string in length()
         * Solution:
         * Think about the subString as a window, compare subString with each piece of a window of the main string.
         * maintain one pointer of the main substring
         */

        int mainStrLength = mainString.length(), subStrLength = subString.length();
        for (int i = 0; i <= mainStrLength - subStrLength; i++) {
            String mainSub = mainString.substring(i, i + subStrLength);
            if (subString.equals(mainSub)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        String[][] tests = {
                {"a", "a"},
                {"abcabc", "cab"},
                {"hellohello", "llohe"},
                {"water", "terwa"},
                {"abcabc", "def"},
                {"", ""}
        };

        for (String[] test : tests) {
            String str1 = test[0];
            String str2 = test[1];
            System.out.println("Is \"" + str2 + "\" a substring  of \"" + str1 + "\"? " +
                    isSubstring(str1, str2));
        }
    }
}
