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
				System.out.print("���ݾ�> ");
				total=total+scanner.nextInt();
			}
			else if (menu==2) {
				System.out.print("��ݾ�> ");
				total=total-scanner.nextInt();
			}
			else if (menu==3) {
				System.out.println("�ܰ�> " + total);
			}
			else {
				System.out.println("���α׷� ����");
				break;
			}
		}
		scanner.close();
	}

}
