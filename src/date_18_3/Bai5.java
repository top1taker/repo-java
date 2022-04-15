package date_18_3;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str = input.nextLine();

		System.out.println("The string is: " + str);

		int[] arr = new int[130];

		for (int i = 0; i < str.length(); i++)
			arr[(int) str.charAt(i)]++;

		for (int i = 0; i < 130; i++)
			if (arr[i] > 0)
				System.out.println((char) i + ": " + arr[i]);

		input.close();
	}

}
