package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Say something: ");
    return scanner.nextLine();

    }

    public boolean yesNo() {
        System.out.println("continue?: [y/n]");
        String answer = scanner.nextLine();
        if (answer.toLowerCase().contains("yes") || answer.toLowerCase().contains("y")) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int answer;
        do {
            answer = scanner.nextInt();
            if (answer >= min && answer <= max) {
                return answer;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
            }
        } while (true);

    }

    public double getDouble(double min, double max) {
        double answer;
        do {
            answer = scanner.nextDouble();
            if (answer >= min && answer <= max) {
                return answer;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
            }
        } while (true);
    }

    public static void main(String[] args) {
        Input string = new Input();
//        System.out.println(string.getString());
        do{
            string.getString();
        } while (string.yesNo());


    }
}
