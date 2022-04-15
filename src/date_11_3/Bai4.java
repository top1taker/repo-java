package date_11_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai4 {

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

	public static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}

	}

	public static int[] ascSort(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			result[i] = arr[i];
		Arrays.sort(result);
		return result;
	}

	public static int[] descSort(int[] arr) {
		int[] result = new int[arr.length];
		int[] ascArr = ascSort(arr);
		for (int i = 0; i < ascArr.length; i++)
			result[i] = ascArr[ascArr.length - i - 1];
		return result;
	}

	public static void main(String[] args) {

		int[] arr = generateArray(10);

		System.out.println("Origin array:");
		showArray(arr);
		
		System.out.println("Enter the number n: ");

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int index = getIndex(arr, n);

		if (index == -1) {
			System.out.println("Not found " + n + " in the array");
		} else {
			System.out.println(n + " first locate at index " + index);
		}
		
		int[] indices = getIndices(arr, n);

		if (indices.length == 0)
			System.out.println("Not found " + n + " in the array");
		else {

			System.out.println(n + " locate at ");

			for (int i = 0; i < indices.length; i++)
				System.out.println(indices[i]);
		}
		
		System.out.println("Ascending array:");
		showArray(ascSort(arr));
		System.out.println("Descending array:");
		showArray(descSort(arr));


		input.close();

	}
}
