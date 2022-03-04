package count_number_of_digits;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			long number;

			System.out.print("Enter a numbers: ");
			number = input.nextLong();

			if (number < 0)
				number = -number;

			int count = 0;

			long temp = number;

			while (temp > 0) {
				count++;
				temp /= 10;
			}

			System.out.println("The total numbers of digits in " + number + " is: " + count);

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
