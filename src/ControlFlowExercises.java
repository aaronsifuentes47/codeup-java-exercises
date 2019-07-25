import java.util.Scanner;

public class ControlFlowExercises {
    private static void fizzBuzz(int num) {
        for (int i = 1; i<=num; i++) {
            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {

        for (int i = 5; i <=15; i++) {
            System.out.println(i);
        }


        for (int x = 2; x <= 65536;) {
            System.out.println(x);
            x = (int) Math.pow(x,2);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a limit: ");
        int userNum = scanner.nextInt();
        fizzBuzz(userNum);
    }
}
