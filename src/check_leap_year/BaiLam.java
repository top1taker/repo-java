package check_leap_year;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			int year;
			do {
				System.out.print("Input a year number: ");
				year = input.nextInt();

			} while (year < 0);

			if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
				System.out.println(year + " is a leap year");
			else
				System.out.println(year + " is not a leap year");

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {

			input.close();
		}

	}

}
