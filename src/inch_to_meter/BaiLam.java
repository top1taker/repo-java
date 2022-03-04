package inch_to_meter;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			double inch;
			System.out.print("Input a value for inch: ");
			inch = input.nextDouble();
			double meters = inch * 0.0254;	
			System.out.println(inch + "inch is " + meters + " meters");

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
