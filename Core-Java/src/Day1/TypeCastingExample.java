package Day1;

public class TypeCastingExample {
    public static void main(String[] args) {

        int intAge = 24;
        float floatAge = intAge;
        System.out.println(intAge);
        System.out.println(floatAge);

        float floatHeight = 5.11F;
        int intHeight = (int) floatHeight;
        System.out.println(floatHeight);
        System.out.println(intHeight);

        char charGrade = 'A';
        System.out.println(charGrade);

        short shortGrade = (short) charGrade;
        System.out.println(shortGrade);

        int intGrade = charGrade;
        System.out.println(intGrade);

        double doubleGrade = charGrade;
        System.out.println(doubleGrade);

        float floatGrade = (float) doubleGrade;
        System.out.println(floatGrade);

        long longGrade = (long) floatGrade;
        System.out.println(longGrade);
    }
}
