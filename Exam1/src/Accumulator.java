import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Keep entering numbers and I will give you the total! Enter 0 to end and get total.");
		int totalSum = 0;
		int addNum = input.nextInt();
		while (addNum != 0) {
			totalSum = totalSum + addNum;
			addNum = input.nextInt();
			
		}
		System.out.println("your total is " + totalSum + "!");
	}

}
