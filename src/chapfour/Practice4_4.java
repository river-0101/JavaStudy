package chapfour;

import java.util.Scanner;

public class Practice4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

		int total=0;		
		
		while (true) {
			System.out.println("------------------------");
			int menu=scanner.nextInt();
			
			if (menu==1) {
				System.out.print("예금액> ");
				total=total+scanner.nextInt();
			}
			else if (menu==2) {
				System.out.print("출금액> ");
				total=total-scanner.nextInt();
			}
			else if (menu==3) {
				System.out.println("잔고> " + total);
			}
			else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		scanner.close();
	}

}
