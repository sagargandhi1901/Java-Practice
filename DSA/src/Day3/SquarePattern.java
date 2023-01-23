package Day3;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        while (row <= n) {
            int stars = 1;
            while (stars <= n) {
                System.out.print("* ");
                stars++;
            }
            row++;
            System.out.println();
        }
    }
}
