package chaptwo;

import java.util.Scanner;

public class Practice2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ȭ���µ�: ");
		double fahrenheit=scanner.nextDouble();
		double celsius=(fahrenheit-32.0)/1.8;
		System.out.printf("ȭ�� %.1f���� ���� %.2f���Դϴ�.",fahrenheit,celsius);
		
		scanner.close();

	}

}
