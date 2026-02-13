import java.util.HashMap;

//12
public class WordFrequencyCounter {
        public static void main(String[] args) {

            String text = "Miku is fun and Miku is cool and fun";

            text = text.toLowerCase();
            String[] words = text.split(" ");

            HashMap<String, Integer> map = new HashMap<>();

            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            System.out.println("Word frequencies:");
            System.out.println(map);
        }
}

