
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = 0;

        for (int i = 1; i <= n; i++) {
            result = (result + k) % i;
        }

        System.out.println(result);  // if it is one based index means use result+1 instaed of result
    }
}
