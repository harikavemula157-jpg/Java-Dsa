import java.util.ArrayList;
import java.util.HashSet;
public class TwoSumHashset {
    static ArrayList<ArrayList<Integer>> twoSum(
            int[] arr, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int needed = target - num;
            if (set.contains(needed)) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(needed);
                pair.add(num);
                result.add(pair);
            }
            set.add(num);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, -2, 4, 5};
        int target = 9;

        System.out.println(twoSum(arr, target));
    }
}