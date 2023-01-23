package Day4;

import java.util.Scanner;

public class RotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int stars = 1;
        int spaces = n - 1;

        while (row <= n) {
            int countOfSpaces = 1;
            while (countOfSpaces <= spaces) {
                System.out.print("  ");
                countOfSpaces++;
            }

            int countOfStars = 1;
            while (countOfStars <= stars) {
                System.out.print("* ");
                countOfStars++;
            }
            System.out.println();
            row++;
            stars++;
            spaces--;
        }
    }
}
