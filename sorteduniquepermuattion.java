
import java.util.*;

public class Main {

    static void perm(char[] a, boolean[] used, String ans) {

        // Check completed permutation
        if (ans.length() == a.length) {
            System.out.println(ans);
            return;
        }

        // Select a character
        for (int i = 0; i < a.length; i++) {

            // Check whether character is already selected
            if (used[i] == true) {
                continue;
            }

            // Avoid duplicate permutations
            if (i > 0 && a[i] == a[i - 1] && !used[i - 1]) {
                continue;
            }

            // Select character
            used[i] = true;

            // Select next character
            perm(a, used, ans + a[i]);

            // Backtracking
            used[i] = false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // Convert String to char array
        char[] a = s.toCharArray();

        // Sort characters
        Arrays.sort(a);

        // Create boolean array
        boolean[] used = new boolean[a.length];

        perm(a, used, "");
    }
}
