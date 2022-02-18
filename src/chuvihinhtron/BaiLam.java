package chuvihinhtron;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		boolean isValid;
		do {
			try {
				isValid = true;
				Scanner input = new Scanner(System.in);

				System.out.print("Nhap d: ");
				double d = input.nextDouble();
				
				System.out.print("Chu vi hinh tron: ");
				System.out.println(d * Math.PI);
				
				input.close();
			} catch (InputMismatchException error) {
				isValid = false;
				System.out.println("Sai kieu du lieu, hay thu lai!");
			}
		} while (!isValid);
	}
}
