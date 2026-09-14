package PracticeJavaDsa;

import java.util.ArrayList;
import java.util.Arrays;
public class TwoSum2P {
    static ArrayList<ArrayList<Integer>> twoSum(
            int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);
                left++;
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
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