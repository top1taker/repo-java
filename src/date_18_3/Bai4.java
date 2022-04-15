package date_18_3;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str = input.nextLine();

		System.out.println("The string is: " + str);
		
		String[] arrStr = str.split("\\s+");
		
		for (int i =0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		
		input.close();
	}

}
