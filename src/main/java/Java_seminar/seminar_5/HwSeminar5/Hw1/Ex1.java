package Java_seminar.seminar_5.HwSeminar5.Hw1;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        String text ="The quick brown fox jumps over the lazy dog. The dog is not amused.";
        String searchWord = "the";

        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            if (lowercaseWord.equals(searchWord.toLowerCase())) {
                wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
            }
        }

        int count = wordCountMap.getOrDefault(searchWord.toLowerCase(), 0);
        System.out.println(searchWord + " - " + count);
    }
}