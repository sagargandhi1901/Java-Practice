package Day4;

import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(calculateBinomialCoefficient(n, r));
    }

    public static int calculateBinomialCoefficient(int n, int r) {
        int factN = calculateFactorial(n);
        int factR = calculateFactorial(r);
        int factNMR = calculateFactorial(n - r);

        return factN / (factR * factNMR);
    }

    public static int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
