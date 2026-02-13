import java.util.HashMap;

//16
public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];

            if (map.containsKey(complete)) {
                System.out.println("Indices: " + map.get(complete) + " and " + i);
                return;
            }
            map.put(nums[i], i);
        }

    }
}
