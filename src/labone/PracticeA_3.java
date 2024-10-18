package labone;

import java.util.Random;
import java.util.Scanner;

public class PracticeA_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]strGame= {"가위","바위","보"};
		
		Scanner scanner=new Scanner(System.in);	
		Random rand=new Random();

		
		while(true) {
			System.out.print("가위 바위 보>> ");
			String userInput=scanner.nextLine();
			
			int randomNum = rand.nextInt(3);
			String computerOutput=strGame[randomNum];
			
			if (userInput.equals("종료")) {
				System.out.println("게임을 종료합니다");
				break;
			}
			
			System.out.println("사용자 : "+userInput+" 컴퓨터 : "+computerOutput);
			
			
			if (userInput.equals("가위") && computerOutput.equals("보") ||
					userInput.equals("바위") && computerOutput.equals("가위") ||
					userInput.equals("보") && computerOutput.equals("바위")) {
				System.out.println("사용자가 이겼습니다.");
			} else if (userInput.equals(computerOutput)) {
				System.out.println("비겼습니다");
			} else {
				System.out.println("사용자가 졌습니다.");
			}
			

		}
		scanner.close();

	}
}
