package display_speed_kmph_mps;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			long meters;
			int hours, minutes, seconds;

			System.out.print("Input distance in meters: ");
			meters = input.nextLong();

			System.out.print("Input hours: ");
			hours = input.nextInt();

			System.out.print("Input minutes: ");
			minutes = input.nextInt();

			System.out.print("Input seconds: ");
			seconds = input.nextInt();
			
			seconds += minutes * 60 + hours * 3600; 
			
			double metersPerSecond = (double)meters / seconds;
			double kilometersPerHour = metersPerSecond * 3.6;
			double milesPerHour = kilometersPerHour / 1.609;
			
			System.out.println("Your speed in meters/second: " + metersPerSecond);
			System.out.println("Your speed in kilomiters/hour: " + kilometersPerHour);
			System.out.println("Your speed in miles/hour: " + milesPerHour);



		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} finally {
			input.close();
		}

	}

}
