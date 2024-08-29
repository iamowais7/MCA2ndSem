package week_6;
import java.util.Scanner;

class Grader {
    private int score;

    public Grader(int score) {
        this.score = score;
    }

    public String letterGrade() {
        if (score >= 90) {
            return "A+";
        } else if (score >= 85) {
            return "A";
        } else if (score >= 80) {
            return "B+";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 65) {
            return "C+";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 55) {
            return "D+";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
public class _1_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int score;
        do {
            System.out.print("Enter the score (0-100): ");
            score = scanner.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a value between 0 and 100.");
            }
        } while (score < 0 || score > 100);

        Grader grader = new Grader(score);
        System.out.println("The grade for the score " + score + " is: " + grader.letterGrade());
        scanner.close();
	}

}
