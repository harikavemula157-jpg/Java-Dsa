import java.util.ArrayList;
import java.util.HashMap;
public class TwoSumHashmap {
    static ArrayList<ArrayList<Integer>> twoSum(
            int[] arr, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int needed = target - num;
            if (map.containsKey(needed)) {
                int frequency = map.get(needed);
                for (int i = 0; i < frequency; i++) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(needed);
                    pair.add(num);
                    result.add(pair);
                }
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, -2, 4, 5};
        int target = 9;

        System.out.println(twoSum(arr, target));
    }
}