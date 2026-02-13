import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentWords {
    public static void main(String[] args) {


        String text = "java is fun java is powerful java";
        String[] words = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Top 2 Frequent Words");
        for (int i = 0; i <2 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
        }
    }
}
