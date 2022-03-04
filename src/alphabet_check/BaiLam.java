package alphabet_check;

import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			String text;
			System.out.print("Input an alphabet: ");
			text = input.nextLine();

			if (text.length() > 1 || !Character.isLetter(text.charAt(0))) {
				throw new Exception();
			}

			String vowel = "ueoai";

			if (vowel.contains(text.toLowerCase())) {
				System.out.println("Input letter is Vowel");
			} else
				System.out.println("Input letter is Consonant");

		} catch (Exception e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
