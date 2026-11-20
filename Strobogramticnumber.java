
import java.util.*;

class Main {

    static boolean isStrobogrammatic(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {

            char a = s.charAt(left);
            char b = s.charAt(right);

            if (a == '0' && b == '0' ||
                a == '1' && b == '1' ||
                a == '8' && b == '8' ||
                a == '6' && b == '9' ||
                a == '9' && b == '6') {

                left++;
                right--;

            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        if (isStrobogrammatic(n)) {
            System.out.println("Strobogrammatic");
        } else {
            System.out.println("Not Strobogrammatic");
        }
    }
}
