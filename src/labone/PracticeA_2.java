package labone;

import java.util.Scanner;

public class PracticeA_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int count=0;
		
		while(count<3) {
			System.out.print("ID: ");
			String name=scanner.nextLine();
			
			if (name.equals("Kim")) {
				while(count<3) {
					System.out.print("PW: ");
					String strPassword=scanner.nextLine();
					int password=Integer.parseInt(strPassword);
					
					if (password==12345) {
						System.out.println("�α��μ���");
						break;
					} else {
						System.out.println("�α��� ����:�н����� Ʋ��");
						count++;
					}
				}
				break;
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
