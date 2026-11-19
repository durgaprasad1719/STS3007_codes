
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int sum = 0, max = 0;
        String current = "", result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                sum += ch - 'a' + 1;
                current += ch;

                if (sum > max) {
                    max = sum;
                    result = current;
                }
            } else {
                sum = 0;
                current = "";
            }
        }

        System.out.println(max);
        System.out.println(result);
    }
}
