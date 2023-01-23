package Day2;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }
}
