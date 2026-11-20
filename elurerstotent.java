
import java.util.*;

class Main {

    static int phi(int n) {

        int result = n;

        for (int p = 2; p * p <= n; p++) {

            if (n % p == 0) {

                while (n % p == 0) {
                    n = n / p;
                }

                result = result - result / p;
            }
        }

        if (n > 1) {
            result = result - result / n;
        }

        return result;
    }

    // static void printTotient(int n) {  -- to print totient values from 1 to n

    //     for (int i = 1; i <= n; i++) {
    //         System.out.println(phi(i));
    //     }
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printTotient(n);
    }
}
