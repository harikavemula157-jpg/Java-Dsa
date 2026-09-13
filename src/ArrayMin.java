// MIN ELEMENT IN ARRAY
public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {34, 12, 89, 5, 67, 23};
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("max element is:" + min);
    }
    }
  // MAX ELEMENT IN ARRAY
//   int[] arr = {12, 45, 7, 89, 34, 56};
// int max = arr[0];
//for (int j = 0; j < arr.length; j++) {
//  if (arr[j] > max) {
//    max = arr[j];
//}
//}
//System.out.println("max element is:" + max);
//}
//}