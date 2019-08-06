package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public Student(String name) {
        this.grades = new ArrayList<>();
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
}
