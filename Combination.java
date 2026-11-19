
import java.util.*;

class Main {

    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        long result = factorial(n) /
                      (factorial(r) * factorial(n-r));

        System.out.println(result);
    }
}
