package Day2;

public class UnaryOperatorsExample {
    public static void main(String[] args) {
        int v1 = 10, v2 = 20, v3 = 30, v4 = 40, v5 = 50;

        System.out.println(++v1);
        System.out.println(--v2);

        System.out.println(v3++);
        System.out.println(v3);

        System.out.println(v4--);
        System.out.println(v4);

        System.out.println(-v5);

        //Exercise
        int x = 100;
        System.out.println(x++ + ++x);

        int y = 200;
        System.out.println(++y + y++);

        int z = 300;
        System.out.println(z++ + --z + z-- + ++z);
    }
}
