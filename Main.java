

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 1. Create & Put
        System.out.println("Task1:");

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        System.out.println(map);
        System.out.println(map.size());

        //2. Get & containsKey
        System.out.println("Task2:");

        System.out.println("Aida score" +map.get("Aida"));

        if (map.containsKey("Mira")){
            System.out.println("Mira score" +map.get("Mira"));
        } else {
            System.out.println("Mira not found");
        }

        //3. Update existing value
        System.out.println("Task3:");

        Integer oldValue = map.put("Dana", 80);
        System.out.println("Old Dana score:" + oldValue);
        System.out.println("Updated map" + map);

        //4. Remove by key
        System.out.println("Task4:");

        Integer removedValue = map.remove("Azat");

        if (removedValue != null) {
            System.out.println("Azat removed successfully. Score was: " + removedValue);
        } else {
            System.out.println("Azat was not found.");
        }

        Integer removedNonExisting = map.remove("NonExisting");

        if (removedNonExisting != null) {
            System.out.println("NonExisting removed.");
        } else {
            System.out.println("NonExisting not found. Nothing removed.");
        }

        System.out.println("Final map: " + map);

        //5. isEmpty & clear
        System.out.println("Task5:");

        System.out.println("Map before clear" + map);
        System.out.println("Is map empty?" + map.isEmpty());

        map.clear();

        System.out.println("Map after clear" + map);
        System.out.println("Is map empty?" + map.isEmpty());

        map.put("Mira", 88);
        map.put("Bek", 79);

        System.out.println("Map after re-inserting: " + map);

        //6. getOrDefault

        System.out.println("Task6:");

        int scoreAida = map.getOrDefault("Aida", -1);
        System.out.println("Aida score: " + scoreAida);

        int scoreMira = map.getOrDefault("Mira", -1);

        if (scoreMira == -1) {
            System.out.println("Mira not found");
        } else {
            System.out.println("Mira score: " + scoreMira);
        }

        int scoreDana = map.getOrDefault("Dana", -1);
        System.out.println("Dana score: " + scoreDana);


        //7. putIfAbsent
        System.out.println("Task7:");

        System.out.println("Before putIfAbsent: " + map);

        map.putIfAbsent("Aida", 90);
        map.putIfAbsent("Mira", 88);

        System.out.println("After putIfAbsent: " + map);

        //8. replace
        System.out.println("Task8:");

        System.out.println("Original map: " + map);

        boolean replaced = map.replace("Aida", 85, 86);
        System.out.println("Replace success?: " + replaced);

        map.replace("Aida", 91);

        Integer result = map.replace("Mira", 100);

        System.out.println("Replace missing key returned: " + result);
        System.out.println("Final map: " + map);

        //9. Iterate over keys, values, entries
        System.out.println("Task9:");

        System.out.println("Keys");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for (int value : map.values()) {
            System.out.println(value);
        }

        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        //10. Count how many have score > 80
        System.out.println("Task10:");

        int count = 0;

        for(int value : map.values()) {
            if(value >= 80) {
                count++;
            }
        }

        System.out.println("Students with score ≥ 80: " + count);

        //11. Find max score and who has it
        System.out.println("Task11:");

        int max = Integer.MIN_VALUE;
        ArrayList<String> topStudents = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                topStudents.clear();
                topStudents.add(entry.getKey());
            }
            else if(entry.getValue() == max) {
                topStudents.add(entry.getKey());
            }
        }

        System.out.println("Max score: " + max);
        System.out.println("Top student(s): " + topStudents);



    }
}








