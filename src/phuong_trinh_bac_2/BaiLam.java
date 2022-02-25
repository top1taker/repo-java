package phuong_trinh_bac_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);

			System.out.println("Nhap a, b, c trong bieu thuc: ax^2 + bx + c = 0");

			System.out.print("Nhap a: ");
			double a = input.nextDouble();

			System.out.print("Nhap b: ");
			double b = input.nextDouble();

			System.out.print("Nhap c: ");
			double c = input.nextDouble();

			if (a == 0) {
				if (b == 0) {
					if (c == 0)
						System.out.println("Phương trình vô số nghiệm");
					else
						System.out.println("Phương trình vô nghiệm!");
				} else {
					System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
				}
			} else {

				double delta = b * b - 4 * a * c;
				double x1;
				double x2;

				if (delta > 0) {
					x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
					x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
					System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
				} else if (delta == 0) {
					x1 = (-b / (2 * a));
					System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
				} else {
					System.out.println("Phương trình vô nghiệm!");
				}
			}

			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Sai kieu du lieu");
		}
	}

}
