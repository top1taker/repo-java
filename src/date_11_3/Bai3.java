package date_11_3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Bai3 {
	public static int[] generateArray(int n) {
		int[] arr = new int[n];
		Random generator = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = generator.nextInt();
		}
		return arr;
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
		System.out.println("Ascending array:");
		showArray(ascSort(arr));
		System.out.println("Descending array:");
		showArray(descSort(arr));

		Scanner input = new Scanner(System.in);

		input.close();

	}
}
