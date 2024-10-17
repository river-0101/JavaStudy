package chapfour;

import java.util.Scanner;

public class practice4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int step=0;
		int pull=0;
		
		while (true) {
			System.out.println("----------------------");
			int menu=scanner.nextInt();
						
			if (menu==1) {
				System.out.print("∞…¿Ωºˆ>> ");
				step=scanner.nextInt();
			} else if (menu==2) {
				System.out.print("∆»±¡>> ");
				pull=scanner.nextInt();
			} else if (menu==3) {
				System.out.printf("∞»±‚ %d∫∏, ∆»±¡ %d∞≥\n", step, pull);
			} else {
				System.out.println("¡æ∑·«‘");
				break;
			}
		}
		scanner.close();
	}

}
