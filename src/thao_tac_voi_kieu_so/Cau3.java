package thao_tac_voi_kieu_so;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cau3 {

	public static void main(String[] args) {
		boolean isValid;
		do {
			try {
				isValid = true;
				Scanner input = new Scanner(System.in);

				System.out.print("Nhap a: ");
				double a = input.nextDouble();

				System.out.print("Nhap b: ");
				double b = input.nextDouble();

				System.out.print("a + b = ");
				System.out.println(a + b);

				System.out.print("a - b = ");
				System.out.println(a - b);

				System.out.print("a * b = ");
				System.out.println(a * b);

				System.out.print("a / b = ");
				System.out.println(a / b);

				System.out.print("a % b = ");
				System.out.println(a % b);

				System.out.print("a ^ b = ");
				System.out.println(Math.pow(a, b));

				input.close();
			} catch (InputMismatchException e) {
				isValid = false;
				System.out.println("Sai kieu du lieu, hay thu lai!");
			}
		} while (!isValid);
	}
	
}