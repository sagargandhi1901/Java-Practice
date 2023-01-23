package Day1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sideOfSquare = sc.nextFloat();

        float areaOfSquare = sideOfSquare * sideOfSquare;
        System.out.println(areaOfSquare);
    }
}
