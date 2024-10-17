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
				System.out.println("로그인성공");
			} else {
				System.out.println("로그인 실패:패스워드 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재 안함");
		}
		scanner.close();

	}

}
