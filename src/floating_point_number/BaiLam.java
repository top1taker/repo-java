package floating_point_number;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Type the number: ");
			float number = input.nextFloat();

			if (number == 0.0)
				System.out.println("Zero");
			else {
				if (number < 0)
					System.out.print("Negative number");
				else
					System.out.print("Positive number");

				if (Math.abs(number) < 1)
					System.out.println(" - small");
				else if (Math.abs(number) > 1000000)
					System.out.println(" - large");
			}

		} catch (

		InputMismatchException e) {
			System.out.println("Wrong input");
		}

		input.close();

	}

}
