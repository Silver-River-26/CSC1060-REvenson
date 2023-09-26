import java.util.Scanner;

public class PrintFPractice {

	public static void main(String[] args) {
		// double dbl = 95.46586;
		// long big = 456745653;
		// String str = "hello";
		// System.out.printf("the value is %-10.4f and %,10d and %s", dbl, big, str);
		for (int i = 0; i < 100; i += 10) {

			for (int n = 0; n <= 10; n++) {
				System.out.printf("%4d", i + n);

			}
			System.out.println();
		}

	}

}
