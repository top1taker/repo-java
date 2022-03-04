package round_floating_number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Type the number a: ");
			double a = input.nextDouble();
			
			System.out.print("Type the number b: ");
			double b = input.nextDouble();
			
			double roundedA =  Math.round(a * 1000.0) / 1000.0;
			double roundedB =  Math.round(b * 1000.0) / 1000.0;
				
			if (roundedA == roundedB) {
				System.out.println("They are same");
			} else 
				System.out.println("They are different");

		} catch (

		InputMismatchException e) {
			System.out.println("Wrong input");
		}

		input.close();

	}

}
