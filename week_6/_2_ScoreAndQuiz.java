package week_6;
import java.util.Scanner;

class Student {
    private String name;
    private double totalScore;
    private int numberOfQuizzes;

    public Student(String name, double score) {
        this.name = name;
        this.totalScore = score;
        this.numberOfQuizzes = 1;
    }

    public Student(double score, String name) {
        this(name, score);
    }

    public Student(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        if (numberOfQuizzes == 0) {
            return 0;
        }
        return totalScore / numberOfQuizzes;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void addQuiz(double score) {
        totalScore += score;
        numberOfQuizzes++;
    }

    public void printStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Average Score: " + getAverage());
    }

    public String toString() {
        return "Student Name: " + name + ", Average Score: " + getAverage();
    }
}
public class _2_ScoreAndQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        Student student = new Student(name);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter score for Quiz " + i + ": ");
            double score = scanner.nextDouble();
            student.addQuiz(score);
        }

        System.out.println("\nStudent Information:");
        System.out.println(student);
        
        scanner.close();
	}

}
