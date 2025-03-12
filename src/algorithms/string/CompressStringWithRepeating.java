package algorithms.string;

//Key: adjacency duplication check and count
//solution: get first different element, and compare it with elements to its right
//alternative solution: compare adjacent item : arr[i] vs arr[i-1]
public class CompressStringWithRepeating {
    static String solution(String s) {
        StringBuilder result = new StringBuilder();
        int N = s.length();
        for (int i = 0; i < N; ) {
            char c = s.charAt(i);
            result.append(c);

            //counting starts by comparing itself
            int count = 0;
            while (i < N && s.charAt(i) == c) {
                i++;
                count++;
            }
            result.append(count);
        }
        return result.toString();
    }

    static String solution2(String s) {
        StringBuilder result = new StringBuilder();
        int N = s.length();
        result.append(s.charAt(0));
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                //add pre item count info
                result.append(count);

                //start a new char
                result.append(s.charAt(i));
                count = 1;
            } else {
                count++;
            }
        }
        result.append(count);
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbbbbccd";
        System.out.println(solution(s)); //expect: a3b5c2d1
        System.out.println(solution2(s)); //expect: a3b5c2d1
    }
}
