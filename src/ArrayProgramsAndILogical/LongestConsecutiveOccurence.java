package ArrayProgramsAndILogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveOccurence {

    public static void main(String[] args) {
        int[] arr = {4, 3, 25, 6, 7, 8, 9, 2, 3, 10};

        List<Integer> longestSequence = findLongestConsecutive(arr);

        System.out.println("Longest Consecutive Sequence: " + longestSequence);
        System.out.println("Length of Sequence: " + longestSequence.size());
    }

    public static List<Integer> findLongestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new ArrayList<>(); // No sequence in an empty array
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Initialize variables
        int start = 0; // Start of the sliding window
        List<Integer> longestSequence = new ArrayList<>();
        List<Integer> currentSequence = new ArrayList<>();
        currentSequence.add(arr[0]);

        for (int end = 1; end < arr.length; end++) {
            if (arr[end] == arr[end - 1] + 1) {
                // Expand the window
                currentSequence.add(arr[end]);
            } else if (arr[end] != arr[end - 1]) {
                // Sequence breaks; check and reset
                if (currentSequence.size() > longestSequence.size()) {
                    longestSequence = new ArrayList<>(currentSequence);
                }
                // Reset the window
                start = end;
                currentSequence.clear();
                currentSequence.add(arr[end]);
            }
        }

        // Final check after loop
        if (currentSequence.size() > longestSequence.size()) {
            longestSequence = currentSequence;
        }

        return longestSequence;
    }
}
