package day_of_month;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			int month, year;
			do {
				System.out.print("Input a month number: ");
				month = input.nextInt();

				System.out.print("Input a year number: ");
				year = input.nextInt();

			} while (month < 0 || month > 12 || year < 0);

			switch (month) {
			case 1:
				System.out.println("January " + year + " has 31 days");
				break;
			case 2:
				int days = 28;
				if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
					days = 29;

				System.out.println("January " + year + " has " + days + " days");
				break;

			case 3:
				System.out.println("March " + year + " has 31 days");
				break;

			case 4:
				System.out.println("April " + year + " has 30 days");
				break;

			case 5:
				System.out.println("May " + year + " has 31 days");
				break;

			case 6:
				System.out.println("June " + year + " has 30 days");
				break;

			case 7:
				System.out.println("July " + year + " has 31 days");
				break;

			case 8:
				System.out.println("August " + year + " has 31 days");
				break;

			case 9:
				System.out.println("September " + year + " has 30 days");
				break;

			case 10:
				System.out.println("Octorber " + year + " has 31 days");
				break;

			case 11:
				System.out.println("November " + year + " has 30 days");
				break;

			case 12:
				System.out.println("December " + year + " has 31 days");
				break;
			}

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
