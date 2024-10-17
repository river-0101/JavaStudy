package chapthree;

import java.util.Scanner;

// Practice3_3 로그인 3회 틀리면 잠김
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
					System.out.println("로그인성공");
					break;
				} else {
					System.out.println("로그인 실패:패스워드 틀림");
					count++;
				}
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
