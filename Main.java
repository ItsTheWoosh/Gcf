import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int one = 27;
        int two = 81;
        int gcd = 0;
        for (int i = 1;i <= one && i <= two; i++) {
            if ((one % i == 0) && (two % i == 0)) gcd = i;
        }
        System.out.println(gcd);
    }
}
