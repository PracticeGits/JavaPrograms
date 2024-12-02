package StringPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestWordsandCount {

    public static void main(String[] args) {

        String str = "Born and raised in a Hindu family in coastal Gujarat, Gandhi trained in the law at the Inner Temple in London and was called to the bar at the age of 22. After two uncertain years in India, where he was unable to start a successful law practice, Gandhi moved to South Africa in 1893 to represent an Indian merchant in a lawsuit. He went on to live in South Africa for 21 years. There, Gandhi raised a family and first employed nonviolent resistance in a campaign for civil rights. In 1915, aged 45, he returned to India and soon set about organising peasants, farmers, and urban labourers to protest against discrimination and excessive land-tax.";
        String[] split = str.toLowerCase().split("[^a-zA-Z]+");

        Map<String, Integer> map = new HashMap<>();

        for (String word : split) {
            int count = word.length();
            map.put(word, count);
        }

        //map cant be sort to descending so we make a list
        List<Map.Entry<String, Integer>> entry = new ArrayList<>(map.entrySet());
        entry.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        int count = 0;
        for (Map.Entry<String, Integer> e : entry) {
            if (count < 10) {
                System.out.println(e.getKey() + "->" + e.getValue());

                count++;
            }
        }


    }


}







