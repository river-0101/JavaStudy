package chapthree;

import java.util.Scanner;

// Practice3_3 �α��� 3ȸ Ʋ���� ���
public class Practice3_3_plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int count=0;
		
		while(count<3) {
			System.out.print("ID: ");
			String name=scanner.nextLine();
			
			System.out.print("PW: ");
			String strPassword=scanner.nextLine();
			int password=Integer.parseInt(strPassword);
			
			if (name.equals("Java")) {
				if (password==12345) {
					System.out.println("�α��μ���");
					break;
				} else {
					System.out.println("�α��� ����:�н����� Ʋ��");
					count++;
				}
			} else {
				System.out.println("�α��� ����:���̵� ���� ����");
				count++;
			}
		}
		
		if (count==3) {
			System.out.println("���� 3ȸ:�õ� ����");
		}
		scanner.close();				
		
	}

}
