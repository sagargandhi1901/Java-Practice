package Day2;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income = sc.nextInt();
        float tax;

        if (income < 500000) {
            tax = 0;
        } else if (income < 1000000) {
            tax = income * 0.2F;
        } else {
            tax = income * 0.3F;
        }

        System.out.println("Tax calculated : " + tax);
    }
}
