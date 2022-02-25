package body_mass_index;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Your weight (kgs): ");
			double weight = input.nextDouble();
			
			System.out.print("Your height (meters): ");
			double height = input.nextDouble();
			
			double BMI = weight / (height * height);
			
			if (BMI < 18.5) System.out.println("Underweight");
			else if (BMI < 25.0) System.out.println("Normal");
			else if (BMI < 30.0) System.out.println("Overweight");
			else System.out.println("Obese");
			
			
		} catch(InputMismatchException e) {
			System.out.println("Wrong input");
		}


		input.close();
	}

}
