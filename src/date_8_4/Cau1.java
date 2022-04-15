package date_8_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Cau1 {
	public static double[] generateArray(int n) {
		double[] arr = new double[n];
		Random generator = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = generator.nextDouble();
		}
		return arr;
	}

	public static void main(String[] args) throws IOException {
		double[] arr = generateArray(10);
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap chuoi ky tu: ");
		String str = input.nextLine();

		BufferedWriter outputWriter = null;

		outputWriter = new BufferedWriter(new FileWriter("D:\\repo-java\\src\\date_8_4\\text.txt"));
		// write to file
		for (int i = 0; i < arr.length; i++) {
			outputWriter.write(Double.toString(arr[i]));
			outputWriter.newLine();
		}
		outputWriter.write(str);

		outputWriter.flush();
		outputWriter.close();
		input.close();

		// read from file
		BufferedReader inputReader = new BufferedReader(new FileReader("D:\\repo-java\\src\\date_8_4\\text.txt"));
		double[] doubleArr = new double[10];
		
		
		for (int i = 0; i < 10; i++) {
			String line = inputReader.readLine();
			doubleArr[i] = Double.valueOf(line);
            
		}
	       
        for (int k = 0; k < 10; k++) System.out.println("So thuc " + k + " doc tu file: " + doubleArr[k]);
        
        String str1 = inputReader.readLine();
        System.out.println("Chuoi doc tu file: " + str1);
        
        inputReader.close();
	}

}
