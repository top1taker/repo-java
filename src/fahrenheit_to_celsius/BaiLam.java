package fahrenheit_to_celsius;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			double f;
			System.out.print("Input a degree in Fahrenheit: ");
			f = input.nextDouble();
			double c = (f - 32.0) * 5.0 / 9.0;
			System.out.println(f + " degree Fahrenheit is equal to " + c + " in Celsius");
			

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
