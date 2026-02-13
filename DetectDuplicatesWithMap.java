import java.util.HashMap;
import java.util.Map;

//17
public class DetectDuplicatesWithMap {
    public static void main(String[] args) {

        String[] str = {"apple","banana","apple","orange","banana","kiwi"};

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String item : str) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        System.out.println("Unique items:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("Duplicated items:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
