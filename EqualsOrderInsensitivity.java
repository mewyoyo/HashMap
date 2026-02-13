import java.util.HashMap;

//18
public class EqualsOrderInsensitivity {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Aida", 85);
        map1.put("Dana", 77);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Dana", 77);
        map2.put("Aida", 85);

        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);

        System.out.println("Equals? " + map1.equals(map2));
        System.out.println("HashCodes:");
        System.out.println(map1.hashCode());
        System.out.println(map2.hashCode());
    }
}
