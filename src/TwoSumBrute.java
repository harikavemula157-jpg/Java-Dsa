import java.util.ArrayList;
public class TwoSumBrute{
    static ArrayList<ArrayList<Integer>> twoSum(
            int[] arr, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    result.add(pair);
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, -2, 4, 5};
        int target = 9;
        System.out.println(twoSum(arr, target));
    }
}