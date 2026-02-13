import java.util.HashMap;

//13
public class CharacterFrequency {
    public static void main(String[] args) {

        String str = "Mississippi";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequency");
        System.out.println(map);
    }
}
