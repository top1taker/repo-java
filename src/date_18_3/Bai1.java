package date_18_3;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str = input.nextLine();

		System.out.println("The string is: " + str);

		System.out.println("The string after remove all spaces: " + str.replaceAll("\\s+", "").replaceAll("\t", ""));

		input.close();

	}

}
