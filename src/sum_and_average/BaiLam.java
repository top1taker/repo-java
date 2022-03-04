package sum_and_average;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			int number, sum = 0;

			System.out.print("Input 5 numbers: ");

			for (int i = 0; i < 5; i++) {
				number = input.nextInt();
				sum += number;
			}

			System.out.println("The sum of 5 no is: " + sum);
			System.out.println("The Average is: " + (sum / 5.0));

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}

		input.close();

	}

}
