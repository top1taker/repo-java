package max_of_three_number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Input the 1st number: ");
			long a = input.nextLong();

			System.out.print("Input the 2nd number: ");
			long b = input.nextLong();

			System.out.print("Input the 3rd number ");
			long c = input.nextLong();

			long maxNumber = a;
			if (b > maxNumber)
				maxNumber = b;
			if (c > maxNumber)
				maxNumber = c;

			System.out.println("The greatest " + maxNumber);

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}

		input.close();

	}

}
