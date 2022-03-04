package minutes_to_years_and_days;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			long minutes;
			int years, days;

			System.out.print("Input the number of minutes: ");
			minutes = input.nextLong();

			days = (int) minutes / (24 * 60);
			years = days / 365;
			days %= 365;

			System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
