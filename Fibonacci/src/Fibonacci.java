import java.util.Random;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int current;
		int t1 = i;
		int t2 = i + 1;
		Scanner input = new Scanner(System.in);
		System.out.println("How may times would you like to loop? plaese enter number");
		int n = input.nextInt();
		System.out.println(t1);
		System.out.println(t2);
		for (i = 0; i < n; i++) {
			current = t1 + t2;
			System.out.println(current);
			t1 = t2;
			t2 = current;
			
		}
	}

}
