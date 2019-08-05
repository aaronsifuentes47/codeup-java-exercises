package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        grades = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
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

//        Student mike = new Student("Mike");
//
//        mike.addGrade(87);
//        mike.addGrade(70);
//        mike.addGrade(90);
//
//        System.out.println("Mike's grade average is: \n" + mike.getGradeAverage());

    }

}
