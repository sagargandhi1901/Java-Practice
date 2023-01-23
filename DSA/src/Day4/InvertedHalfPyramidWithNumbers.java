package Day4;

import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int numbers = n;

        while (row <= n) {
            int countOfNumbers = 1;
            while (countOfNumbers <= numbers) {
                System.out.print(countOfNumbers + " ");
                countOfNumbers++;
            }
            System.out.println();
            row++;
            numbers--;
        }
    }
}
