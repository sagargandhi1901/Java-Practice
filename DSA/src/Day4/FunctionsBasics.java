package Day4;

import java.util.Scanner;

public class FunctionsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int product = multiply(num1, num2);
        System.out.println(product);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
