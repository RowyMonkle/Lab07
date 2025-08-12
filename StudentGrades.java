import java.util.Scanner;

public class StudentGrades {
    private Student[] students;

    // Constructor of Student objects
    public StudentGrades(Student[] students) {
        this.students = students;
    }

    // catch the exception (implement)
    public void processAllStudents() {
        for (int i = 0; i < students.length; i++) {
            try {
                System.out.println("Student " + (i + 1) + ": " + students[i].getName());
                processStudent(students[i]);
            } catch (FailedSignificantlyException e) {
                System.out.println("Significant Failure: " + e.getMessage());
            }
            System.out.println();
        }
        System.out.println("Grade calculation process concluded.");
    }

    // score calculating~processing for each student
    private void processStudent(Student student) {
        int[] scores = student.getScores();

        if (scores == null || scores.length == 0) { //in case that array was empty
            System.out.println("Error: Scores array cannot be empty.");
            return;
        }

        int sum = 0;

        for (int score : scores) {
            if (score < 0) {
                System.out.println("Error: Score cannot be less than 0.");
                return;
            }
            if (score > 100) {
                System.out.println("Error: Score cannot be greater than 100.");
                return;
            }
            sum += score;
        }

        double avg = (double) sum / scores.length;

        if (avg < 40) { //in case of fail the course
            throw new FailedSignificantlyException(
                    "Student average is " + avg + ", which is a significant failure."
            );
        }

        System.out.println("Average score: " + avg);
    }

    // inner class for test student (Main)
    public static class Student {
        private String name;
        private int[] scores;

        public Student(String name, int[] scores) {
            this.name = name;
            this.scores = scores;
        }
//the getters
        public String getName() {
            return name;
        }
        public int[] getScores() {
            return scores;
        }
    }
}
