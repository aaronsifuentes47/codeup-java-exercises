import java.util.Scanner;

public class MethodsExercises {

    private static int doAddition(int numA, int numB) {
        return numA + numB;
    }
    private static int doSubtraction(int numA, int numB) {
        return numA - numB;
    }
    private static int doDivision(int numA, int numB) {
        return numA / numB;
    }
    private static int multiply(int numA, int numB) {
        return numA * numB;
    }
    private static void factorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "! = ");
            factorial = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) {
                    System.out.print(" x ");
                }
                factorial*=j;
            }
            System.out.println(" = " + factorial);
        }

    }
    private static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int answer;
        do {
        answer = scan.nextInt();
            if (answer >= min && answer <= max) {
                return answer;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
            }
        } while (true);
    }
    private static void factorialGame() {
        Scanner scanner = new Scanner(System.in);
        do {
            int userNum = getInteger(1, 10);
            factorial(userNum);
            System.out.println("Play again? [y/n]:");
            if (!scanner.nextLine().toLowerCase().contains("y")) return;
        } while (true);
    }

    private static int rollDie(int sides) {

        return (int) Math.ceil(Math.random() * sides);
    }
    public static void rollDice() {
        System.out.println("Roll the dice! Choose how many sides on each: ");
        int sides = getInteger(4,20);
        int die1 = rollDie(sides);
        int die2 = rollDie(sides);

        System.out.printf("You rolled a %d and a %d.\n", die1,die2);
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int numA = scanner.nextInt();
//        int numB = scanner.nextInt();
//        System.out.println(doAddition(numA,numB));
//        System.out.println(doSubtraction(numA,numB));
//        System.out.println(doDivision(numA,numB));
//        System.out.println(multiply(numA,numB));
//        System.out.println("Enter a number between 1 and 10: ");
////        factorialGame();
        rollDice();

    }

}
