package date_11_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiTapVeHam {
	static Scanner input = new Scanner(System.in);

	public static void Cau1() {
		System.out.println("Lập trình Java 2021");
	}

	public static void Cau2(String str) {
		System.out.println(str);
	}

	public static void GiaiPTB1(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			System.out.println("Phuong trinh co nghiem: " + (-b / a));
		}
	}

	public static void GiaiPTB2(double a, double b, double c) {
		if (a == 0) {
			GiaiPTB1(b, c);
		} else {

			double delta = b * b - 4 * a * c;
			double x1;
			double x2;

			if (delta > 0) {
				x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
				x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
				System.out.println("Phuong trinh co 2 nghiem la : " + "x1 = " + x1 + " vÃ  x2 = " + x2);
			} else if (delta == 0) {
				x1 = (-b / (2 * a));
				System.out.println("Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1);
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
	}

	public static void Cau4() {
		// Cau 4
		try {

			System.out.println("Nhap a, b trong bieu thuc: ax + b = 0");

			System.out.print("Nhap a: ");
			double a = input.nextDouble();

			System.out.print("Nhap b: ");
			double b = input.nextDouble();

			GiaiPTB1(a, b);

		} catch (InputMismatchException e) {
			System.out.println("Sai kieu du lieu");
		} finally {
			input.close();
		}
	}

	public static void Cau5() {
		// Cau 5
		try {

			System.out.println("Nhap a, b, c trong bieu thuc: ax^2 + bx + c = 0");

			System.out.print("Nhap a: ");
			double a = input.nextDouble();

			System.out.print("Nhap b: ");
			double b = input.nextDouble();

			System.out.print("Nhap c: ");
			double c = input.nextDouble();

			GiaiPTB2(a, b, c);

		} catch (InputMismatchException e) {
			System.out.println("Sai kieu du lieu");
		} finally {
			input.close();
		}
	}
	
	public static void Cau6() {
		try {
			int n;
			
			do {
				System.out.print("Nhap lua chon: (1 | 2): ");
				n = input.nextInt();
			} while (n != 1 || n != 2);
			input.nextLine(); // clear Scanner buffer

			if (n == 1) {
				Cau4();
			} else {
				Cau5();
			}

		} catch (InputMismatchException e) {
			System.out.println("Sai kieu du lieu");
		} finally {
			input.close();
		}
	}

	public static void main(String[] args) {
		Cau1();
		Cau2("Hello world");

		// Cau 3

		try {
			int n;
			do {
				System.out.print("Nhap so nguyen duong n: ");
				n = input.nextInt();
			} while (n <= 0);
			input.nextLine(); // clear Scanner buffer

			System.out.print("Nhap thong diep: ");

			String message = input.nextLine();
			for (int i = 0; i < n; i++)
				Cau2(message);

		} catch (InputMismatchException e) {
			System.out.println("Sai kieu du lieu");
		} finally {
			input.close();
		}
		
		Cau4();
		Cau5();

		Cau6();
		
		// Cau 7
		boolean tiepTuc = true;
		char c;
		do {
			Cau6();
			System.out.print("Ban co muon tiep tuc (y/n): ");
			c = input.next().charAt(0);
			tiepTuc = c == 'y';
		} while(tiepTuc);

		

	}

}
