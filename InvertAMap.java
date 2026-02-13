import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//21
public class InvertAMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Dana", 85);
        map.put("Mira", 90);

        HashMap<Integer, ArrayList<String>> inverted = new HashMap<>();

        for (Map.Entry<String,Integer> entry : map.entrySet()){

            inverted
                    .computeIfAbsent(entry.getValue(),  k -> new ArrayList<>())
                    .add(entry.getKey());
            String key = entry.getKey();
        }
        System.out.println("Inverted Map: " + inverted);
    }
}
