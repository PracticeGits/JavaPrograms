package StringPrograms;

import java.util.HashSet;

public class LongestNonRepetativeWordAndLength {
    //data-->maxlength=0,start=0,end=0. if already present in set increase start by 1 start++,else add that char in set..at last update maxlength by Math.max(maxlength,end-start +1)
        public static int longestUniqueSubstring(String s) {
            int maxLength = 0;
            int start = 0;
            HashSet<Character> charSet = new HashSet<>();

            for (int end = 0; end < s.length(); end++) {
                char currentChar = s.charAt(end);
//abcabcbb
                // If the character is already in the set, shrink the window
                if (charSet.contains(currentChar)) {
                   start++;
                }

                // Add the current character to the set
                charSet.add(currentChar);

                // Update the maximum length
                maxLength = Math.max(maxLength, end - start + 1);//(0,0-0=0+1=1)->(0,1)1st iteration
            }
            charSet.forEach(System.out::print);

            return maxLength;
        }

        public static void main(String[] args) {
            String input = "abcabcbbabcde";
            System.out.println("Longest unique substring length: " + "\n"+longestUniqueSubstring(input));
        }
    }


