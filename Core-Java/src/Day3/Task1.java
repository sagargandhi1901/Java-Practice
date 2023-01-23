package Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age : ");
        int age = sc.nextInt();

        if (age < 1 || age > 100) {
            System.out.println("Enter valid age");
        } else if (age < 18) {
            System.out.println("Not eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }
}
