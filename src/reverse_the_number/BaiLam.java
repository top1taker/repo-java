package reverse_the_number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			long number, temp, reversedNumber = 0;

			System.out.print("Enter the number: ");
			number = input.nextLong();

			int negative = number < 0 ? -1 : 1;

			number *= negative;
			temp = number;

			while (temp > 0) {
				reversedNumber = reversedNumber * 10 + temp % 10;
				temp /= 10;
			}

			number *= negative;
			reversedNumber *= negative;

			System.out.println("Reverse number of " + number + " is: " + reversedNumber);

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
