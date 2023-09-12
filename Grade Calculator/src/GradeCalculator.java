import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number grade");
		grade = input.nextInt();
		if (grade >= 92) {
			System.out.println("You have an A!");
		} else if (grade >= 89) {
			System.out.println("You have an A-!");
		} else if (grade >= 87) {
			System.out.println("You have an B+!");
		} else if (grade >= 82) {
			System.out.println("You have an B!");
		} else if (grade >= 79) {
			System.out.println("You have an B-!");
		} else if (grade >= 77) {
			System.out.println("You have an C+!");
		} else if (grade >= 72) {
			System.out.println("You have an C!");
		} else if (grade >= 69) {
			System.out.println("You have an C-!");
		} else if (grade >= 67) {
			System.out.println("You have an D+!");
		} else if (grade >= 60) {
			System.out.println("You have an D!");
		} else {
			System.out.println("You Failed");
		}
	}
}