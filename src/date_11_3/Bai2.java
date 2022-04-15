package date_11_3;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {
	public static int[] generateArray(int n) {
		int[] arr = new int[n];
		Random generator = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = generator.nextInt();
		}
		return arr;
	}

	public static int[] getIndices(int[] arr, int n) {
		int count = 0;
		boolean[] checks = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				count++;
				checks[i] = true;
			}
		}

		int[] indices = new int[count];

		for (int i = 0; i < count; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (checks[j])
					indices[i] = j;
			}
		}

		return indices;
	}

	public static void main(String[] args) {

		int[] arr = generateArray(10);
		for (int i = 0; i < 10; i++)
			System.out.println("arr[" + i + "]: " + arr[i]);

		System.out.println("Enter the number n: ");

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		input.close();

		int[] indices = getIndices(arr, n);

		if (indices.length == 0)
			System.out.println("Not found " + n + " in the array");
		else {

			System.out.println(n + " locate at ");

			for (int i = 0; i < indices.length; i++)
				System.out.println(indices[i]);
		}

	}

}