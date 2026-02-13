import java.util.HashMap;

//15
public class FirstNoneRepeatingCharacter {
    public static void main(String[] args) {

        String str = "swiss";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        char result = ' ';
        boolean found = false;

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                result = c;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("First Non-Repeating Character: " + result);
        }  else {
            System.out.println("None");
        }
    }
}
