package chapthree;

import java.util.Scanner;

public class Practice3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);		
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		int money=scanner.nextInt();
		int res;
		
		res=money/50000;
		money=money%50000;
		if(res>0)
			System.out.printf("�������� %d��\n", res);
		res=money/10000;
		money=money%10000;
		if(res>0)
			System.out.printf("������ %d��\n", res);
		res=money/5000;
		money=money%5000;
		if(res>0)
			System.out.printf("��õ���� %d��\n", res);
		res=money/1000;
		money=money%1000;
		if(res>0)
			System.out.printf("õ���� %d��\n", res);
		
		scanner.close();
		
	}

}
