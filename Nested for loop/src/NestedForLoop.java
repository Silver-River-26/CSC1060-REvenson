import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		int columns;
		int i;
		int j;
		Scanner input = new Scanner(System.in);
		System.out.println("How many rows would you like?");
		rows = input.nextInt();
		System.out.println("How many columns would you like?");
		columns = input.nextInt();
		for (i = 1; i <= rows; i++) {
			
			System.out.println();
			
			for (j = 1; j <= columns; j++) {
				System.out.print("#");
			}
		}
	}

}
