package date_18_3;

import java.util.Scanner;

public class Bai2 {
	public static String capitalizeWord(String str) {
		String words[] = str.split("\\s+");
		String capitalizeWord = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalizeWord += first.toUpperCase() + afterfirst + " ";
		}
		return capitalizeWord.trim();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str = input.nextLine();

		System.out.println("The string is: " + str);

		String result = capitalizeWord(str);

		System.out.println("The string after transform: " + result);

		input.close();

	}

}
