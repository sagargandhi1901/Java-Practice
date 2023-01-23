package Day3;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
//        if (isPrime) {
//            System.out.println("Prime");
//        } else {
//            System.out.println("Not Prime");
//        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
