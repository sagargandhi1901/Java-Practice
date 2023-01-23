package Day3;

public class ParseExamples {
    public static void main(String[] args) {

        //String to int
        String s1 = "25";
        int v1 = Integer.parseInt(s1);
        System.out.println(v1);

        //String to float
        String s2 = "25.5";
        float v2 = Float.parseFloat(s2);
        System.out.println(v2);

        //int to String
        int v3 = 55;
        String s3 = String.valueOf(v3);
        System.out.println(v3 + v3);
        System.out.println(s3 + s3);
    }
}
