package Day3;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int stars = 1;

        while (row <= n) {
            int count = 1;
            while (count <= stars) {
                System.out.print("* ");
                count++;
            }
            System.out.println();
            row++;
            stars++;
        }
    }
}
