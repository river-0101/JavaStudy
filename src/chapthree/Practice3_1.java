package chapthree;

import java.util.Scanner;

public class Practice3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("2�ڸ� ���� �Է�(10~99)>> ");
		int n=scanner.nextInt();
		int ten=n/10;
		int one=n%10;
		
		if (ten==one)
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		
		scanner.close();
		
	}

}
