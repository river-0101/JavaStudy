package labone;

import java.util.Random;
import java.util.Scanner;

public class PracticeA_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]strGame= {"����","����","��"};
		
		Scanner scanner=new Scanner(System.in);	
		Random rand=new Random();

		
		while(true) {
			System.out.print("���� ���� ��>> ");
			String userInput=scanner.nextLine();
			
			int randomNum = rand.nextInt(3);
			String computerOutput=strGame[randomNum];
			
			if (userInput.equals("����")) {
				System.out.println("������ �����մϴ�");
				break;
			}
			
			System.out.println("����� : "+userInput+" ��ǻ�� : "+computerOutput);
			
			
			if (userInput.equals("����") && computerOutput.equals("��") ||
					userInput.equals("����") && computerOutput.equals("����") ||
					userInput.equals("��") && computerOutput.equals("����")) {
				System.out.println("����ڰ� �̰���ϴ�.");
			} else if (userInput.equals(computerOutput)) {
				System.out.println("�����ϴ�");
			} else {
				System.out.println("����ڰ� �����ϴ�.");
			}
			

		}
		scanner.close();

	}
}
