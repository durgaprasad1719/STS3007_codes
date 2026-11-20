
import java.util.*;

class Main {

    static void swap(int[] a, int i, int j, int d) {
        for (int k = 0; k < d; k++) {
            int temp = a[i + k];
            a[i + k] = a[j + k];
            a[j + k] = temp;
        }
    }

    static void rotate(int[] a, int d) {
        int n = a.length;

        d = d % n;

        if (d == 0)
            return;

        int i = d;
        int j = n - d;

        while (i != j) {

            if (i < j) {
                swap(a, d - i, d + j - i, i);
                j = j - i;
            } 
            else {
                swap(a, d - i, d, j);
                i = i - j;
            }
        }

        swap(a, d - i, d, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int d = sc.nextInt();

        rotate(a, d);

        for (int x : a)
            System.out.print(x + " ");
    }
}
