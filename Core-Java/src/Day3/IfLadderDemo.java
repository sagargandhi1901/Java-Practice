package Day3;

import java.util.Scanner;

public class IfLadderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        }
        if (n % 2 == 0) {
            System.out.println("Even");
        }
    }
}
