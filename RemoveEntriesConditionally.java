import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//19
public class RemoveEntriesConditionally {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 40);
        map.put("Dana", 55);
        map.put("Mira", 91);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            if (entry.getValue() < 60) {
                iterator.remove();
            }
        }
        System.out.println("After removing: " + map);
    }
}
