package thao_tac_voi_kieu_so;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		boolean isValid;
		do {
			try {
				isValid = true;
				Scanner input = new Scanner(System.in);

				System.out.print("Nhap a: ");
				byte a = input.nextByte();
				
				System.out.print("Nhap b: ");
				byte b = input.nextByte();
				
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
			} catch (InputMismatchException error) {
				isValid = false;
				System.out.println("Sai kieu du lieu, hay thu lai!");
			}
		} while (!isValid);
	}
}