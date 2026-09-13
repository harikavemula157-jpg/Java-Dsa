public class Main {
    public static void main(String[] args) {
        int[] arr = {-5,-2,-10,-1};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("maximum is" + min  );
    }
}