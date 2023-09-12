import java.util.Scanner;

public class WhileStatment {
	public static void main(String[] args) {
		String name;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter Name");
		name = input.nextLine();
		System.out.println("please enter age");
		age = input.nextInt();
		while (age < 0) {
			System.out.println("Error please enter age older then 0");
			age = input.nextInt();
		}
		System.out.println("Thank you");
	}
}
