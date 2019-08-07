package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        String userInput = scanner.nextLine();
        return userInput;
    }
    public boolean yesNo() {
        System.out.println("continue?: [y/n]");
        String answer = scanner.nextLine();
        return (answer.toLowerCase().contains("yes") || answer.toLowerCase().equalsIgnoreCase("y"));
    }
    public int getInt(String prompt) {
        System.out.println(prompt);
        return this.getInt();
    }
    public int getInt() {
        int userInput = 0;
        try {
            userInput = Integer.valueOf(scanner.nextLine());
            System.out.println("You entered: " + userInput);
        } catch (NumberFormatException e) {
            System.out.println("this is an error, please try again: ");
           return getInt();
        }
        return userInput;
    }
    public int getInt(int min, int max) {
        int answer = 0;
        System.out.printf("Please enter a number between %d and %d: \n", min, max);
        do {
            try {
            answer = Integer.valueOf(scanner.nextLine());
                System.out.println("You entered: " + answer);
            } catch (NumberFormatException e){
                System.out.println("BAD NUMBER BAD NUMBER BAD NUMBER");
                continue;
            }
            if (answer >= min && answer <= max) {
                return answer;
            } else {
                System.out.printf("Invalid input. Please enter a number between %d and %d.\n", min, max);
            }
        } while (true);
    }

    public double getDouble() {
        double userInput = 0;
        try {
            userInput = Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("this is an error, please try again: ");
            return getDouble();
        }
        return userInput;
    }

    public double getDouble(double min, double max) {
        double answer;
        System.out.printf("Enter a number between %.2f and %.2f: ", min, max);
        do {
            try {
            answer = Double.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("BAD NUMBER BAD NUMBER BAD NUMBER");
                continue;
            }
            if (answer >= min && answer <= max) {
                System.out.println("You entered: " + answer);
                return answer;
            } else {
                System.out.printf("Invalid input. Please enter a number between %.2f and %.2f.", min, max);
            }
        } while (true);
    }
}
