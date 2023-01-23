package Day3;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice : ");
        int userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("AC is on");
                break;
            case 2:
                System.out.println("Fan is on");
                break;
            default:
                System.out.println("Nothing is on");
                break;
        }
    }
}
