import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please select a beveage! Press 1 for Water, 2 for Coke and 3 for Coffee...");
		int beverage = input.nextInt();
		if (beverage == 1) {
			System.out.println("You have selected Water!");
		} else if (beverage == 2) {
			System.out.println("You have selected Coke!");
		} else if (beverage == 3) {
			System.out.println("You have selected Coffee!");
		}
	}

}
