
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            sum += ch - 'a' + 1;
        }

        System.out.println("Maximum Profit: " + sum);
        System.out.println("Substring: " + s);
    }
}
