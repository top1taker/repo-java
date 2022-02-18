package thao_tac_voi_kieu_so;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cau2 {

	public static void main(String[] args) {
		boolean isValid;
		do {
			try {
				isValid = true;
				Scanner input = new Scanner(System.in);

				System.out.print("Nhap a: ");
				int a = input.nextInt();

				System.out.print("Nhap b: ");
				int b = input.nextInt();

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