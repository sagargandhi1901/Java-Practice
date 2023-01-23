package Day4;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convertDecToBin(num));
    }

    public static int convertDecToBin(int num) {
        int power = 0;
        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 2;
            sum = sum + (int)(lastDigit * Math.pow(10, power));
            num = num / 2;
            power++;
        }
        return sum;
    }
}
