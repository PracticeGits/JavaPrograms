package StringPrograms;

public class ReverseStringWordOnly {

    public static void main(String[] args) {

        // Input string
        String input = "Hello world";

        // Splitting the input string into words
        String[] words = input.split(" ");

        // StringBuilder to store the final result
        StringBuilder result = new StringBuilder();

        // Looping through each word
        for (String word : words) {
            // Reversing the current word using StringBuilder's reverse method
            String reversedWord = new StringBuilder(word).reverse().toString();

            // Adding the reversed word to the result with a space
            result.append(reversedWord).append(" ");
        }

        // Printing the reversed words
        System.out.println(result.toString().trim());
    }


    }



