package chapthree;

import java.util.Scanner;

public class Practice3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("ID: ");
		String name=scanner.nextLine();
		
		System.out.print("PW: ");
		String strPassword=scanner.nextLine();
		int password=Integer.parseInt(strPassword);
		
		if (name.equals("Java")) {
			if (password==12345) {
				System.out.println("�α��μ���");
			} else {
				System.out.println("�α��� ����:�н����� Ʋ��");
			}
		} else {
			System.out.println("�α��� ����:���̵� ���� ����");
		}
		scanner.close();

	}

}
