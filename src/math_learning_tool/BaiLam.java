package math_learning_tool;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BaiLam {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		do {
			a = ThreadLocalRandom.current().nextInt(0, 9 + 1);
			b = ThreadLocalRandom.current().nextInt(0, 9 + 1);
		} while (a < b);

		System.out.println("What is " + a + " - " + b + "?");
		int result = input.nextInt();

		if (a - b == result)
			System.out.println("Correct!");
		else
			System.out.println("Wrong!");

		input.close();
	}

}
