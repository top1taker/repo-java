package phuong_trinh_bac_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);

			System.out.println("Nhap a, b trong bieu thuc: ax + b = 0");

			System.out.print("Nhap a: ");
			double a = input.nextDouble();

			System.out.print("Nhap b: ");
			double b = input.nextDouble();

			if (a == 0) {
				if (b == 0) {
					System.out.println("Phuong trinh co vo so nghiem");
				} else {
					System.out.println("Phuong trinh vo nghiem");
				}
			} else {
				System.out.println("Phuong trinh co nghiem: " + (-b / a));
			}

			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Sai kieu du lieu");
		}
	}

}
