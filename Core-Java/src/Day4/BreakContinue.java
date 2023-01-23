package Day4;

public class BreakContinue {
    public static void main(String[] args) {

        //Normal loop statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println(i);
            }
        }

        //Break will terminate the execution of the loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Continue will only skip that particular iteration
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
