package date_18_3;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		String nstr = "";

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str = input.nextLine();

		System.out.println("The original string is: " + str);

		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println("Reversed word: " + nstr);

		input.close();
	}

}
