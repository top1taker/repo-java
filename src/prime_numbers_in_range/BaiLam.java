package prime_numbers_in_range;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			int a, b;

			do {
				System.out.print("Enter the range [a, b]: ");
				a = input.nextInt();
				b = input.nextInt();
			} while (a > b || a < 0 || b < 0);

			for (int i = a; i <= b; i++) {
				boolean isPrimeNumber = true;
				
				for (int k = 2; k <= i / 2; k++)
					if (i % k == 0) {
						isPrimeNumber = false;
						break;
					}
				
				if (i > 1 && isPrimeNumber)
					System.out.println(i);
			}

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
