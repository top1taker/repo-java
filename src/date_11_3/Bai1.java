package date_11_3;

import java.util.Random;
import java.util.Scanner;

public class Bai1 {
	public static int[] generateArray(int n) {
		int[] arr = new int[n];
		Random generator = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = generator.nextInt();
		}
		return arr;
	}

	public static int getIndex(int[] arr, int n) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}
		return index;
	}

	public static void main(String[] args) {

		int[] arr = generateArray(10);
		for (int i = 0; i < 10; i++)
			System.out.println("arr[" + i + "]: " + arr[i]);

		System.out.println("Enter the number n: ");

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int index = getIndex(arr, n);

		if (index == -1) {
			System.out.println("Not found " + n + " in the array");
		} else {
			System.out.println(n + " locate at index " + index);
		}
		
		input.close();

	}

}
