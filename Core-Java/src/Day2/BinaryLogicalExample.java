package Day2;

public class BinaryLogicalExample {
    public static void main(String[] args) {

        boolean c1 = true, c2 = false, c3 = true;

        System.out.println(c1 && c2);
        System.out.println(c1 && c3);
        System.out.println(c1 && c2 && c3);
        System.out.println(c1 || c2);
        System.out.println(c1 || c3);
        System.out.println(c1 || c2 || c3);
        System.out.println(c1 && c2 || c3);
        System.out.println(c1 || c2 && c3);
        System.out.println(c1 || c2 || !c3);
        System.out.println(c1 && c2 || !c3);
    }
}
