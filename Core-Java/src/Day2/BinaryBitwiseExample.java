package Day2;

public class BinaryBitwiseExample {
    public static void main(String[] args) {

        int n1 = 14, n2 = 9, n3 = 20, n4 = 40;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        System.out.println(~n1);
        System.out.println(~n2);
        System.out.println(n3 << 3);
        System.out.println(n4 >> 2);

        //Addition of two numbers without using + operator
        System.out.println(n1 - ~n2 -1);

        //Subtraction of two numbers without using - operator
        System.out.println(n1 + ~n2 + 1);
    }
}
