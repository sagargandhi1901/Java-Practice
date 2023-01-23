package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 6 subjects : ");
        float sub1 = sc.nextInt();
        float sub2 = sc.nextInt();
        float sub3 = sc.nextInt();
        float sub4 = sc.nextInt();
        float sub5 = sc.nextInt();
        float sub6 = sc.nextInt();

        float total = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6);
        float average = total / 6;

        if (average > 80) {
            System.out.println("Grade A");
        } else if (average > 75) {
            System.out.println("Grade B");
        } else if (average > 60) {
            System.out.println("Grade C");
        } else if (average > 50) {
            System.out.println("Grade D");
        } else if (average > 33) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }

        if ((sub1 < 33) || (sub2 < 33) || (sub3 < 33) || (sub4 < 33) || (sub5 < 33) || (sub6 < 33)) {
            System.out.println("FAIL");
        } else {
            System.out.println("PASS");
        }

        if ((sub1 >= 33)) {
            System.out.println("Passed in Subject 1");
        } else {
            System.out.println("Failed in Subject 1");
        }
        if ((sub2 >= 33)) {
            System.out.println("Passed in Subject 2");
        } else {
            System.out.println("Failed in Subject 2");
        }
        if ((sub3 >= 33)) {
            System.out.println("Passed in Subject 3");
        } else {
            System.out.println("Failed in Subject 3");
        }
        if ((sub4 >= 33)) {
            System.out.println("Passed in Subject 4");
        } else {
            System.out.println("Failed in Subject 4");
        }
        if ((sub5 >= 33)) {
            System.out.println("Passed in Subject 5");
        } else {
            System.out.println("Failed in Subject 5");
        }
        if ((sub6 >= 33)) {
            System.out.println("Passed in Subject 6");
        } else {
            System.out.println("Failed in Subject 6");
        }

        if ((sub1 >= sub2) &&  (sub1 >= sub3) && (sub1 >= sub4) && (sub1 >= sub5) && (sub1 >= sub6)) {
            System.out.println("Subject 1 marks : " + sub1 + " is highest");
        } else if ((sub2 >= sub3) && (sub2 >= sub4) &&(sub2 >= sub5) &&(sub2 >= sub6)) {
            System.out.println("Subject 2 marks : " + sub2 + " is highest");
        } else if ((sub3 >= sub4) && (sub3 >= sub5) &&(sub3 >= sub6)) {
            System.out.println("Subject 3 marks : " + sub3 + " is highest");
        } else if ((sub4 >= sub5) && (sub4 >= sub6)) {
            System.out.println("Subject 4 marks : " + sub4 + " is highest");
        } else if (sub5 >= sub6) {
            System.out.println("Subject 5 marks : " + sub5 + " is highest");
        } else {
            System.out.println("Subject 6 marks : " + sub6 + " is highest");
        }

        if ((sub1 <= sub2) &&  (sub1 <= sub3) && (sub1 <= sub4) && (sub1 <= sub5) && (sub1 <= sub6)) {
            System.out.println("Subject 1 marks : " + sub1 + " is lowest");
        } else if ((sub2 <= sub3) && (sub2 <= sub4) &&(sub2 <= sub5) &&(sub2 <= sub6)) {
            System.out.println("Subject 2 marks : " + sub2 + " is lowest");
        } else if ((sub3 <= sub4) && (sub3 <= sub5) &&(sub3 <= sub6)) {
            System.out.println("Subject 3 marks : " + sub3 + " is lowest");
        } else if ((sub4 <= sub5) && (sub4 <= sub6)) {
            System.out.println("Subject 4 marks : " + sub4 + " is lowest");
        } else if (sub5 <= sub6) {
            System.out.println("Subject 5 marks : " + sub5 + " is lowest");
        } else {
            System.out.println("Subject 6 marks : " + sub6 + " is lowest");
        }
    }
}
