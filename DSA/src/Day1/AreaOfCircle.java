package Day1;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14F * radius * radius;
        System.out.println(area);
    }
}
