import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentGrades.Student stu1 = new StudentGrades.Student("Adithi", new int[]{85, 93, 75, 92}); //normal
        StudentGrades.Student stu2 = new StudentGrades.Student("Sakuni", new int[]{85, 120, 75}); //surpass 100
        StudentGrades.Student stu3 = new StudentGrades.Student("Chandra", new int[]{}); //expecting to be empty
        StudentGrades.Student stu4 = new StudentGrades.Student("Sohraya", new int[]{-30, -20, 40}); //less than 0
        StudentGrades.Student stu5 = new StudentGrades.Student("Isana", new int[]{70, 0, 78, 0}); //expect to be fail

        StudentGrades sg = new StudentGrades(new StudentGrades.Student[]{stu1, stu2, stu3, stu4, stu5});
        sg.processAllStudents();
    }
}