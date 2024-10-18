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
						System.out.println("로그인성공");
						break;
					} else {
						System.out.println("로그인 실패:패스워드 틀림");
						count++;
					}
				}
				break;
			} else {
				System.out.println("로그인 실패:아이디 존재 안함");
				count++;
			}
		}
		
		if (count==3) {
			System.out.println("오류 3회:시도 금지");
		}
		scanner.close();				
		

	}

}
