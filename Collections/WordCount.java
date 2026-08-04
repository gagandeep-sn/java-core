import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        // Input text to analyze
        String text = "hello world hello java world";
        
        // Map to store words (Key) and their occurrences (Value)
        HashMap<String, Integer> map = new HashMap<>();
        
        // Split text by space and iterate over each word
        for (String w : text.split(" ")) {
            // Fetch current count (or 0 if new), increment by 1, and save back
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        
        // Print the word counts: {world=2, java=1, hello=2}
        System.out.println(map);
    }
}
