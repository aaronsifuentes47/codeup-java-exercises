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

    private static int findRemainder(int numA, int numB) {
        return numA % numB;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%s!: %s\n", i, factorial(i));
        }

        System.out.println(factorial(numA));

        System.out.println(doAddition(numA,numB));
        System.out.println(doSubtraction(numA,numB));
        System.out.println(doDivision(numA,numB));
        System.out.println(multiply(numA,numB));

    }

}
