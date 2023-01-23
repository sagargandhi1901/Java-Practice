package Day2;

import java.util.Scanner;

public class ConditionalStatementsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("adult : can drive, vote");
        }
        else if (age >= 13) {
            System.out.println("teenager");
        } else {
            System.out.println("not adult yet");
        }
    }
}
