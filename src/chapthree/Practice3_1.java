package chapthree;

import java.util.Scanner;

public class Practice3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("2자리 정수 입력(10~99)>> ");
		int n=scanner.nextInt();
		int ten=n/10;
		int one=n%10;
		
		if (ten==one)
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		
		scanner.close();
		
	}

}
