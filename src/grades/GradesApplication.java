package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String,Student> students = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        Student mike = new Student("Mike");
        Student john = new Student("John");
        Student gabe = new Student("Gabe");
        Student ralph = new Student("Ralph");

        mike.addGrade(80);
        mike.addGrade(78);
        mike.addGrade(92);

        john.addGrade(78);
        john.addGrade(82);
        john.addGrade(76);

        gabe.addGrade(99);
        gabe.addGrade(99);
        gabe.addGrade(60);

        ralph.addGrade(70);
        ralph.addGrade(80);
        ralph.addGrade(100);

        students.put("mike",mike);
        students.put("john",john);
        students.put("gabe",gabe);
        students.put("ralph",ralph);

        System.out.println("Welcome!");
        System.out.println();

        do {
        System.out.println("Please choose which student to investigate: ");
        System.out.printf("|%s| |%s| |%s| |%s|\n",mike.getName(),john.getName(), gabe.getName(),ralph.getName());
        System.out.println("-------------------------------");
        String query = scan.nextLine().toLowerCase();

            if (students.containsKey(query)) {
                System.out.println("| " + query + " |");
                System.out.println("Student Name: " + students.get(query).getName());
                System.out.println("Grade average: "+ students.get(query).getGradeAverage());
                System.out.println("continue?: [y/n]");
                String answer = scan.nextLine();

                if (answer.contains("n") || answer.contains("no")) {
                    System.out.println("goodbye!");
                    break;
                }
            } else {
                System.out.println("" + query + " is not a valid name. Please enter a name: ");
            }
        } while (true);
//        for (Student student: students.values()) {
//            System.out.print("student name: ");
//            System.out.println(student.getName());
//            System.out.print("student grade average: ");
//            System.out.println(student.getGradeAverage());
//        }



    }
}
