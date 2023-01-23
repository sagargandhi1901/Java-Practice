package Day4;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkPalindrome(n) ? "Palindrome" : "Not a palindrome");
    }

    public static boolean checkPalindrome(int num) {
        int temp = num;
        int reverse = 0;

        while (num > 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }
        return reverse == temp;
    }
}
