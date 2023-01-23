package Day2;

public class BinaryArithmeticExample {
    public static void main(String[] args) {

        int v1 = 10, v2 = 6;

        System.out.println(v1 + v2);
        System.out.println(v1 - v2);
        System.out.println(v1 * v2);
        System.out.println(v1 / v2);
        System.out.println(v1 % v2);

        //Concatenation of two string using + operator
        System.out.println("Hi" + " " + "Sagar");

        System.out.println(1 + 2);

        //First addition will be performed then concatenation with string
        System.out.println(1 + 2 + " Hi");

        //Values after string will be concatenated to string itself
        System.out.println("Hi" + 1 + 2);

        //Brackets have the highest priority, first it will be solved then it will be appended to string
        System.out.println("Hi" + (1 + 2));

        //v1 = 10, v2 = 6
        System.out.println("v1 = " + v1 + ", v2 = " + v2);

        //Addition of 10 and 6 is : 16
        System.out.println("Addition of " + v1 + " and " + v2 + " is : " + (v1 + v2));
    }
}
