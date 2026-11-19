
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int digits = 0;
        int sum = 0;

        // Count number of digits
        int t = n;
        while (t > 0) {
            digits++;
            t = t / 10;
        }

        // Calculate Armstrong sum
        while (n > 0) {
            int rem = n % 10;

            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * rem;
            }

            sum = sum + power;
            n = n / 10;
        }

        if (sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
