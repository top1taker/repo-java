package factorial_of_given_number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			int number;
			long factorialNumber = 1;

			do {
				System.out.print("Enter the number: ");
				number = input.nextInt();
			} while (number < 0);

			for (int i = 2; i <= number; i++)
				factorialNumber *= i;

			System.out.println("Factorial number of " + number + " is: " + factorialNumber);

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
