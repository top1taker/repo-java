package sum_of_digits;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			double number;
			System.out.print("Input an integer between 0 and 1000: ");
			number = input.nextDouble();
			
			int sumOfDigits = 0;
			
			double temp = number;

			while(temp > 0) {
				sumOfDigits += temp % 10;
				temp /= 10;
			}
			
			System.out.println("The sum of all digits in " + number +  " is " + sumOfDigits);
			
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
