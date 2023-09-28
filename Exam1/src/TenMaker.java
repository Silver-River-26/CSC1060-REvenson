
public class TenMaker {

	public static void main(String[] args) {
		boolean ten = false;
		ten = makes10(ten);
		if (ten == true) {
			System.out.println("Those numbers DO equal ten!");
		} else if (ten == false) {
			System.out.println("Those numbers DO NOT equal ten!");
		}
	}

	public static boolean makes10(boolean ten) {
		int num1 = 6;
		int num2 = 4;
		if (num1 + num2 == 10) {
			ten = true;
			return ten;
		} else {
			ten = false;
			return ten;
		}
	}
}
