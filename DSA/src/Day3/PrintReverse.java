package Day3;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }
    }
}
