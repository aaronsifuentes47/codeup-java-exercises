import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f\n", pi);
//        System.out.println("Enter an integer: ");
//        int userNumber = scanner.nextInt();
//        System.out.println("You have entered: " + userNumber);
//        System.out.println("Enter 3 words: ");
//        String uI = scanner.next();
//        String uI2 = scanner.next();
//        String uI3 = scanner.next();
//        System.out.println("Your 3 words are: ");
//        System.out.println(uI);
//        System.out.println(uI2);
//        System.out.println(uI3);8
//        System.out.println("Enter a sentence: ");
//        String userSent = scanner.nextLine();
//        System.out.println("Your sentence is: ");
//        System.out.println(userSent);
        System.out.println("Give the height of the classroom: ");
        int height = scanner.nextInt();
        System.out.println("Now give the width of the classroom: ");
        int width = scanner.nextInt();
        long area = (height*2) + (width * 2);
        System.out.format("The area of the classroom is %o", area);



    }
}
