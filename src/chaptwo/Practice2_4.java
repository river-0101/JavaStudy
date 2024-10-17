package chaptwo;

import java.util.Scanner;

public class Practice2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("È­¾¾¿Âµµ: ");
		double fahrenheit=scanner.nextDouble();
		double celsius=(fahrenheit-32.0)/1.8;
		System.out.printf("È­¾¾ %.1fµµ´Â ¼·¾¾ %.2fµµÀÔ´Ï´Ù.",fahrenheit,celsius);
		
		scanner.close();

	}

}
