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
}
