package positive_or_negative;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Type the number: ");
			long number = input.nextLong();
			
			if (number < 0) System.out.println("Number is negative");
			else if (number > 0)System.out.println("Number is positive");
			
		} catch(InputMismatchException e) {
			System.out.println("Wrong input");
		}

		input.close();
		
	}

}
