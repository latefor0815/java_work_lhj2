package Test_240510;

import java.util.Scanner;
import java.util.ArrayList;

public class CircleArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle[] circles = new Circle[4];

		for (int i = 0; i < circles.length; i++) {
			System.out.print((i + 1) + " 반지름 >> ");
			int radius = scanner.nextInt();
			circles[i] = new Circle(radius);
		}
		System.out.println("저장하였습니다...");

		double totalArea = 0.0;
		for (int i = 0; i < circles.length; i++) {
			totalArea += circles[i].getArea();
		}
		System.out.printf("원의 면적 전체 합은 %.2f\n", totalArea);

		scanner.close();
	}
}