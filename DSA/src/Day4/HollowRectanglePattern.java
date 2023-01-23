package Day4;

import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int row = 1;
        while (row <= r) {

            int col = 1;
            while (col <= c) {
                if (row == 1 || row == r || col == 1 || col == c) {         //Boundary cells
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
