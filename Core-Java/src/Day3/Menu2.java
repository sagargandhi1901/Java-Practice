package Day3;

import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accNumber, accBalance, transactionAmount, userChoice;

        System.out.println("Enter the account number : ");
        accNumber = sc.nextInt();

        System.out.println("Enter the initial balance in the account : ");
        accBalance = sc.nextInt();

        System.out.println("1.Deposit\n2.Withdraw\n3.Balance check\n4.Quit\nEnter your choice : ");
        userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Enter the amount you want to deposit : ");
                transactionAmount = sc.nextInt();
                if (transactionAmount > 0) {
                    System.out.println("Deposit transaction is done in account : "+ accNumber +" and the updated balance is : " + (accBalance + transactionAmount));
                } else {
                    System.out.println("Please enter valid amount");
                }
                break;
            case 2:
                System.out.println("Enter the amount you want to withdraw : ");
                transactionAmount = sc.nextInt();
                if (transactionAmount > 0 && transactionAmount <= accBalance) {
                    System.out.println("Withdraw transaction is done in account : "+ accNumber +" and the updated balance is : " + (accBalance - transactionAmount));
                } else {
                    System.out.println("Please enter valid amount");
                }
                break;
            case 3:
                System.out.println("Available balance : " + accBalance);
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid choice...");
                break;
        }
    }
}
