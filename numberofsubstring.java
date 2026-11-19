
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                count++;
                System.out.println(s.substring(i, j + 1));
            }
        }

        System.out.println("Count = " + count);
    }
}
