import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {

//		int[] numbers = { 1, 2, 3, 4, 5 };
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = numbers[i] * 2; 
//		}
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + ",");
//		}

//		int[] numbers = { 1, 2, 3, 4, 5 };
//		int[] numbers2 = new int[numbers.length];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers2[i] = numbers[i] * 2;
//		}
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers2[i] + ",");
//		}

//		String[] strArr = { "Hello", "Goodbye", "Oh! No!" };
//		for (int i = 0; i < strArr.length; i++) {
//			int[] strLeng = new int[strArr.length];
//			strLeng[i] = strArr[i].length();
//			System.out.println(strLeng[i]);
//		}

//		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
//		int[] arr2 = { 2, 3, 4, 5, 6, 7 };
//
//		int[] arr3 = new int[arr2.length];
//		for (int i = 0; i < arr2.length; i++) {
//			arr3[i]= arr1[i]* arr2[i];
//			System.out.print(arr3 [i]+",");
//		}

		// Scanner input = new Scanner(System.in);
		// System.out.print("Enter number of enteries: ");
		// int numEnteries = input.nextInt();
//
		// int[] nums = new int[numEnteries];
//
		// for (int i = 0; i < numEnteries; i++) {
		// System.out.print("Enter number:");
		// int number = input.nextInt();
		// nums[i] = number;
		// }
		// for (int i = 0; i < nums.length; i++) {
		// System.out.print(nums[i] + ",");
		// }

		int[] arr1 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		int[] arrNew = multiplyByTwo(arr1);
		System.out.println();
		for (int i = 0; i < arrNew.length; i++) {
			System.out.print(arrNew[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	public static int[] multiplyByTwo(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i] * 2;
		}
		return arr2;
	}

}
