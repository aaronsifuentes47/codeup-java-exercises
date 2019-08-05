package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private ArrayList<Integer> grades = new ArrayList<>();
    private String name;


    public Student(String name) {
        this.name = name;
    }

    public String getName(String name) {
        this.name = name;
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
            int i = 0;
            int sum = 0;
        for (int grade:grades) {
            sum += grade;
            i++;
        }
        return sum / i;
    }

    public static void main(String[] args) {

        Student mike = new Student("mike");

        mike.addGrade(87);
        mike.addGrade(70);
        mike.addGrade(90);

        System.out.println(mike.getGradeAverage());

    }

}
