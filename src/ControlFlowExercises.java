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

        System.out.println("Enter your grade: ");
        int grade = scanner.nextInt();

        if (grade < 59) {
            System.out.println("can I get an F in chat");
        } else if (grade > 59 && grade <= 68) {
            System.out.println("Hey! You barely made it! D for you.");
        } else if (grade >= 68 && grade <= 79) {
            System.out.println("It's a C! Not bad.");
        } else if (grade > 79 && grade <= 87) {
            System.out.println("Bingo! You got a B.");
        } else if (grade > 87) {
            System.out.println("Look at you mister show off. A.");
        }
    }
}
