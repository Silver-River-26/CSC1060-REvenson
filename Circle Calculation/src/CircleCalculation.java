import java.util.Scanner;

public class CircleCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the radius");
		int radius = input.nextInt();
		diameter(radius);

	}

	public static void diameter(int radius) {

		int diameter = radius * 2;
		System.out.println("the diameter is " + diameter + "!");
	}
}
