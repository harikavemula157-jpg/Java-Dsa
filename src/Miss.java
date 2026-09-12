import java.util.Arrays;
public class Miss {
        int missingnum(int arr[]) {
        Arrays.sort(arr);
        int a = 1;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]==a) {
                a++;
            }
        }
       return(a);
    }
}