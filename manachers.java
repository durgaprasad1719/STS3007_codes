
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder("#");

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append("#");
        }

        String str = sb.toString();

        int n = str.length();
        int[] p = new int[n];

        int center = 0, right = 0;
        int maxLen = 0, maxCenter = 0;

        for (int i = 0; i < n; i++) {

            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(p[mirror], right - i);
            }

            while (i - p[i] - 1 >= 0 &&
                   i + p[i] + 1 < n &&
                   str.charAt(i - p[i] - 1) ==
                   str.charAt(i + p[i] + 1)) {
                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxLen) / 2;

        String ans = s.substring(start, start + maxLen);

        System.out.println(ans);
        System.out.println(maxLen);
    }
}
