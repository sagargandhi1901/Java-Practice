package Day3;

import java.util.Scanner;

public class Menu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, userChoice;

        System.out.println("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Mod\n6.Quit\nEnter your choice :");
        userChoice = sc.nextInt();

        switch (userChoice) {
            case 1 :
                System.out.println("Addition : " + (num1 + num2));
                break;
            case 2 :
                System.out.println("Subtraction : " + (num1 - num2));
                break;
            case 3 :
                System.out.println("Multiplication : " + (num1 * num2));
                break;
            case 4 :
                System.out.println("Division: " + (num1 / num2));
                break;
            case 5 :
                System.out.println("Modulo : " + (num1 % num2));
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid choice....");
                break;
        }
    }
}
