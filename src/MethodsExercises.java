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
    private static int factorial(int num) {
        if (num == 1) {
            return num;
        } else {
            return num * factorial( num-1);
        }
    }
//    private static int findRemainder(int numA, int numB) {
//        return numA % numB;
//    }
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        System.out.println(doAddition(numA,numB));
        System.out.println(doSubtraction(numA,numB));
        System.out.println(doDivision(numA,numB));
        System.out.println(multiply(numA,numB));
        System.out.println("Enter a number between 1 and 10: ");
        int userNum = getInteger(1,10);

        for (int i = 1; i < 10; i++) {
            System.out.printf("%s!: %s\n", i, factorial(i));
        }
        System.out.println(factorial(userNum));
    }

}
