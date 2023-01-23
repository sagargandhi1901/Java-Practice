package Day2;

public class BinaryAssignmentExample {
    public static void main(String[] args) {

        int a, b, c, d;
        a = 100;
        b = c = 500;
        d = a + b + (++c);
        System.out.println(d);

        a = b;

        System.out.println(a += 300);
        System.out.println(a -= 200);
        System.out.println(a *= 4);
        System.out.println(a /= 24);
        System.out.println(a %= 40);
    }
}
