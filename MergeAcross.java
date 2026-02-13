import java.util.HashMap;
import java.util.Map;

//20
public class MergeAcross {
    public static void main(String[] args) {

        HashMap<String, Integer> scores1 = new HashMap<>();
        scores1.put("Aida", 40);
        scores1.put("Azat", 35);
        scores1.put("Dana", 50);

        HashMap<String, Integer> scores2 = new HashMap<>();
        scores2.put("Azat", 10);
        scores2.put("Dana", 5);
        scores2.put("Mira", 45);

        for (Map.Entry<String, Integer> entry : scores2.entrySet()) {
            scores1.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Merged scores: " + scores1);
    }
}
