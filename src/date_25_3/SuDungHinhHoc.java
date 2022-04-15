package date_25_3;

import java.util.Arrays;
import java.util.Random;

public class SuDungHinhHoc {
	public static double getRandomNumber(int min, int max) {
		Random r = new Random();
	    return  min + (max - min) * r.nextDouble();
	}

	public static void main(String[] args) {
		// Khoi tao 10 Circle
		Circle[] circleArr = new Circle[10];
		for (int i = 0; i < 10; i++ ) {
			double radius = getRandomNumber(5, 25);
			circleArr[i] = new Circle("red", true, radius);
		}
		for (int i = 0; i < 10; i++) System.out.println("Circle " + i + ": " +  circleArr[i]);
		
		// Khoi tao 10 Rectangle
		Rectangle[] rectArr = new Rectangle[10];
		for (int i = 0; i < 10; i++ ) {
			double width = getRandomNumber(1, 15);
			double height = getRandomNumber(20, 35);
			
			rectArr[i] = new Rectangle("blue", false, width, height);
		}
		for (int i = 0; i < 10; i++) System.out.println("Rectangle " + i + ": " +rectArr[i]);
		
		// Sap xep 2 mang
		Arrays.sort(circleArr);
		Arrays.sort(rectArr);
		
		System.out.println("After sort: ");
		for (int i = 0; i < 10; i++) System.out.println("Circle " + i + ": " +  circleArr[i]);
		for (int i = 0; i < 10; i++) System.out.println("Rectangle " + i + ": " +rectArr[i]);
	}

}
