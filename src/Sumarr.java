public class Sumarr {
        class Main {
            static int missingelement(int[] a, int n) {
                int s = 0;
                for (int i = 1; i <= n; i++)
                    s += i;
                for (int i = 0; i < n - 1; i++)
                    s -= a[i];
                return s;
            }
            public static void main(String[] args) {
                int[] a = {1, 2, 3, 5};
                System.out.println(missingelement(a, 5));
            }
        }
    }


