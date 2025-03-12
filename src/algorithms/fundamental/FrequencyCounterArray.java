package algorithms.fundamental;

/**
 * alternative way of Frequency Counter other than the Map<Integer,Integer> freq
 */
public class FrequencyCounterArray {
    static int[] countEachCharFrequency(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c] = freq[c] + 1;
        }
        return freq;
    }

    public static void main(String[] args) {
        String s = "This is CharFrequencyCounter app";
        System.out.println(countEachCharFrequency(s)[84]); //1  "T"  occurs 1
    }
}
