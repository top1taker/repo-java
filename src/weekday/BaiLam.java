package weekday;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			int number;
			do {
				System.out.print("Type the number: ");
				number = input.nextInt();
			} while (number < 0);

			int generatedNum = number % 7;

			switch (generatedNum) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			}

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}

		input.close();

	}

}
