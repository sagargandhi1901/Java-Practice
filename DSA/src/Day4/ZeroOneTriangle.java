package Day4;

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;

        while (row <= n) {
            int col = 1;
            while (col <= row) {
                if ((row + col) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
