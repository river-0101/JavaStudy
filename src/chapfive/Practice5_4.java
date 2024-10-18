package chapfive;

import java.util.Scanner;

public class Practice5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String []nameList=new String[10];
		int []valueList=new int[10];

		int balance=100000;
		String item;
		int amount;
		
		while (true) {
			System.out.println("1.���� | 2.���� | 3.���� | 4.��� | 5.����");
			int menu=scanner.nextInt();
			
			if (menu==1) {
				System.out.print("���� >> ");
				item=scanner.next();
				System.out.print("�ݾ� >> ");
				amount=scanner.nextInt();
				balance+=amount;
				addBook(nameList, valueList, item, amount);
			} else if (menu==2) {
				System.out.print("���� >> ");
				item=scanner.next();
				System.out.print("�ݾ� >> ");
				amount=scanner.nextInt();
				balance-=amount;
				addBook(nameList, valueList, item, -amount);
			} else if (menu==3) {
				System.out.print("���� >> ");
				item=scanner.next();
				balance-=removeBook(nameList, valueList, item);
			} else if (menu==4) {
				showBook(nameList, valueList, balance);
			} else {
				System.out.println("���α׷� ����");
				break;
			}
		}
		scanner.close();
	}
	
	public static void addBook(String[] nameList, int[] valueList, String item, int amount) {
		for (int i=0; i<nameList.length;i++) {
			if(nameList[i]==null) {	// ����ִ� ���� ���� 	
				nameList[i]=item;
				valueList[i]=amount;
				break;
			}
		}
	}
	
	public static int removeBook(String[] nameList, int[] valueList, String item) {
		int value=0;
		for (int i=0;i<nameList.length;i++) {
			if(nameList[i].equals(item)) {
				value=valueList[i];
				nameList[i]=null;
				valueList[i]=0;
				System.out.println(item+" ������");
				break;
			}
		}
		return value;	// ������ ��ŭ �ܾ��� �����־����, �Լ� int Ÿ��
		
	}
	
	public static void showBook(String[] nameList, int[] valueList, int balance) {
		for (int i=0;i<nameList.length;i++) {
			if(nameList[i]!=null) {
				System.out.printf("%s: %d��\n",nameList[i],valueList[i]);
			}
		}
		System.out.println("�ܾ�: "+balance+"��");
	}

}
