package Day1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float firstItemCost = sc.nextFloat();
        float secondItemCost = sc.nextFloat();
        float thirdItemCost = sc.nextFloat();

        float totalCost = firstItemCost + secondItemCost + thirdItemCost;
        float totalCostAfterTax = totalCost + (totalCost * 0.18F);

        System.out.println(totalCostAfterTax);
    }
}
