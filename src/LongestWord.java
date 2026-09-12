public class LongestWord {
    public static void main(String[] args) {
        String[] arr = {"Apple", "orange", "kiwi", "banana"};
        String longest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            }
        }
        System.out.println(longest);
    }
}