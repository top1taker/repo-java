package computing_loan_payment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiLam {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);

			System.out.print("Loan amount: ");
			double loanAmount = input.nextDouble();

			System.out.print("Monthly interest rate: ");
			double monthlyInterestRate = input.nextDouble();

			System.out.print("Number of years: ");
			int numberOfYears = input.nextInt();

			double monthlyPayment = (loanAmount * monthlyInterestRate)
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

			System.out.println("Monthly	payment: " + monthlyPayment);

			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Sai kieu du lieu");
		}
	}

}
