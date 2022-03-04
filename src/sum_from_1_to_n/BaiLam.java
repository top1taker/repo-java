package sum_from_1_to_n;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			long sum = 0;
			int number;

			do {
				System.out.print("Enter the number: ");
				number = input.nextInt();
			} while (number < 0);

			for (int i = 1; i <= number; i++) {
				sum += i;
			}

			System.out.println("Sum from 1 to " + number + " is: " + sum);

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
