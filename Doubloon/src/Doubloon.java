
public class Doubloon {
	public static void main(String[] args) {
		

	}

	public static boolean isDoubloon(Boolean doubloon) {
		String word = "noonn";
		for (int o = 0; o < word.length(); o++) {
			int count = 0;
			char letter = word.charAt(o);
			for (int i = 0; i < word.length(); i++) {

				char second = word.charAt(i);
				if (letter == second) {
					count += 1;
				}
			}
			if (count == 2) {
				true;
			} else {
				return false;
			}

		}
		
	}
}