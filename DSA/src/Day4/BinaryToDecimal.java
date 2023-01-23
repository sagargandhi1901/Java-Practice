package Day4;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convertBinToDec(num));
    }

    public static int convertBinToDec(int num) {
        int power = 0;
        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            sum = sum + (int)(lastDigit * Math.pow(2, power));
            num = num / 10;
            power++;
        }
        return sum;
    }
}
