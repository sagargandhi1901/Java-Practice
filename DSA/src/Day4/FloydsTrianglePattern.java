package Day4;

import java.util.Scanner;

public class FloydsTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int stars = 1;
        int value = 1;

        while (row <= n) {
            int count = 1;
            while (count <= stars) {
                System.out.print(value + "\t");
                count++;
                value++;
            }
            System.out.println();
            row++;
            stars++;
        }
    }
}
