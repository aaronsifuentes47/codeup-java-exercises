import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {
//        String message = "We don't need no education\n";
//        message += "We don't need no thought control\n";
//        message += "Check \"this\" out! \"s inside of \"s!\n";
//        message += "I can do backslashes \\, double backslashes \\\\, and triple backslashes! \\\\\\\n";
//        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        System.out.println("A frenetic teen approaches you, wielding styled hair and a polished leather jacket. He seems\n" +
                "somewhat distraught, but he approaches you cautiously and slowly.");
                int i = 0;
        do {
            System.out.println("What do you say?");

            String question = scanner.nextLine();
            if (question.contains("who are you")) {
                System.out.println("\"My name's Bob. For your safety, don't ask questions.\"");
            } else if (question.contains("hi") || question.contains("hello") || question.contains("how's it")) {
                System.out.println("He waves his hand, looking toward the distance. He's distracted by something.");
            } else if (question.contains("looking") || question.contains("looking at")) {
                System.out.println("\"Nothing.\"");
            } else if (question.contains("what are you doing") || question.contains("you doing")) {
                System.out.println("\"Running. From them.\"");
            } else if (question.endsWith("?")) {
                System.out.println("\"Don't ask questions! I hate questions.\"");
            } else if (question.endsWith("!")){
                System.out.println("\"Shut up! Do you want them to hear us?!\"");
            } else if (question.contains("hears us")) {
                System.out.println("\"Them. The creatures. They've been chasing me for -- nevermind.\"");
            } else if(question.contains("them")|| question.contains("creatures") || question.contains("no one here") || question.contains("no one")) {
                System.out.println("\"I didn't get a good look at them, but they're out there. Watching. Waiting. " +
                        "Don't walk in the dark alone.\"");
            } else if (question.contains("bye")) {
                System.out.println("\"I never asked for help anyway. Out of my way.\"");
                break;
            } else {
                i++;
                System.out.println("\"Stop saying useless things.\"");
                if (i >= 3) {
                    System.out.println("\"I don't have time for this. Get out of my way.\"");
                    break;
                }
            }
        } while (true);
    }
}
