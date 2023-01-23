package Day5;

public class ArraysDemo {
    public static void main(String[] args) {

        /* ---------------One dimensional array----------------*/

        //Array declaration
        int[] ages = new int[4];
        //Array initialization
        ages[0] = 57;
        ages[1] = 51;
        ages[2] = 27;
        ages[3] = 25;

        //Array accessing
        //using for loop
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

        System.out.println();

        //using for-each loop
        for (int age : ages) {
            System.out.print(age + " ");
        }

        System.out.println();

        /* ---------------Two dimensional array----------------*/

        int[][] matrix = new int[2][2];
        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[1][0] = 30;
        matrix[1][1] = 40;

        //Using for loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Using for-each loop
        for (int[] row : matrix) {
            for (int var : row) {
                System.out.print(var + " ");
            }
            System.out.println();
        }
    }
}
