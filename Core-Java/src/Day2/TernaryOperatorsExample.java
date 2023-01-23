package Day2;

public class TernaryOperatorsExample {
    public static void main(String[] args) {

        //Check if number is positive or negative
        int num = 10;
        System.out.println(num > 0 ? "positive" : "negative");

        //Check if age is valid for voting
        int age = 21;
        System.out.println(age >= 0 ? "valid" : "not valid");

        //Check if number is even or odd
        int num2 = 9;
        System.out.println(num % 2 == 0 ? "even" : "odd");

        //Check which number is bigger
        int num3 = 10, num4 = 20;
        System.out.println(num3 > num4 ? num3 : num4);
    }
}
