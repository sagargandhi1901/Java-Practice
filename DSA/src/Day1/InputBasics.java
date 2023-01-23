package Day1;

import java.util.Scanner;

public class InputBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        float height = sc.nextFloat();
        long phoneNumber = sc.nextLong();
        String firstName = sc.next();

        System.out.println(i);
        System.out.println(firstName);
        System.out.println(height);
        System.out.println(phoneNumber);
    }
}
