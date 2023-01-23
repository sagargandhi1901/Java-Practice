package Day2;

public class OperatorsBasics {
    public static void main(String[] args) {

        //Binary operators
        int a = 50;
        int b = 15;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Unary operators
        System.out.println(a++);                //Post increment
        System.out.println(++a);                //Pre increment
        System.out.println(b--);                //Post decrement
        System.out.println(--b);                //Pre decrement

        //Relational operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);;

        //Logical operators
        System.out.println((a > b) && (a < b));
        System.out.println((a > b) || (a < b));
        System.out.println(!(a > b));

        //Assignment operators
        a += 10;
        b -= 5;
        System.out.println(a);
        System.out.println(b);

        //Ternary operators
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
