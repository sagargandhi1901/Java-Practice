package Day5;

import java.util.Scanner;

public class AdditionUsingEncapsulation {

    //Data
    private double num1;
    private double num2;

    public AdditionUsingEncapsulation(double p1, double p2) {
        num1 = p1;
        num2 = p2;
    }

    //Method
    private double doAddition() {
        double result;
        result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        AdditionUsingEncapsulation add = new AdditionUsingEncapsulation(d1, d2);
        double result = add.doAddition();
        System.out.println(result);
    }
}
