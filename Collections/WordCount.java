import java.util.HashMap;
public class WordCount {
    public static void main(String[] args) {
        String text = "hello world hello java world";
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : text.split(" ")) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        System.out.println(map);
    }
}
