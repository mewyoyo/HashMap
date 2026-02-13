import java.util.ArrayList;
import java.util.HashMap;

//14
public class GroupWordsByLength {
    public static void main(String[] args) {

        String[] words = {"IA","Miku","Teto","Rei","Gumi","Rin"};

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (String word : words) {

            map.computeIfAbsent(word.length(), k -> new ArrayList<>())
                    .add(word);

        }
        System.out.println("Grouping by length:");
        System.out.println(map);
    }
}
