package algorithms.string.implementation;

import java.util.*;

/**
 * convert string/substring to numbers:
 * split 12[abc]  different stacks
 */
public class StringToNumberOriginal {
    Deque<Integer> numStack = new ArrayDeque<>();
    Deque<String> stringStack = new ArrayDeque<>();
    String s = "12[abc]";

    public static void split(String s) {
        List<Integer> ints = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        boolean isPrevDigit = false;
        boolean isPrevLetter = false;
        StringBuilder digitSeqBuilder = new StringBuilder();
        StringBuilder letterSeqBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (isPrevDigit == false) {
                    //start a new digit sequence
                    digitSeqBuilder = new StringBuilder();

                    //put existing letter sequence into list
                    if (!letterSeqBuilder.isEmpty()) {
                        strings.add(letterSeqBuilder.toString());
                    }
                }
                digitSeqBuilder.append(s.charAt(i));
                isPrevDigit = true;
                isPrevLetter = false;
            } else if (Character.isLetter(s.charAt(i))) {
                if (isPrevLetter == false) {
                    //start a new digit sequence
                    letterSeqBuilder = new StringBuilder();

                    //put existing letter sequence into list
                    if (!digitSeqBuilder.isEmpty()) {
                        ints.add(Integer.parseInt(digitSeqBuilder.toString()));
                    }
                }
                letterSeqBuilder.append(s.charAt(i));
                isPrevLetter = true;
                isPrevDigit = false;
            }
        }
        if(isPrevDigit){
            ints.add(Integer.parseInt(digitSeqBuilder.toString()));
        }
        if(isPrevLetter){
            strings.add(letterSeqBuilder.toString());
        }
        //output
        System.out.println(ints);
        System.out.println(strings);
    }

    public static void main(String[] args) {
        String s = "12ABC3CD";
        split(s);
    }
}


