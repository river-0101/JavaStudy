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
			System.out.println("1.수입 | 2.지출 | 3.삭제 | 4.출력 | 5.종료");
			int menu=scanner.nextInt();
			
			if (menu==1) {
				System.out.print("내역 >> ");
				item=scanner.next();
				System.out.print("금액 >> ");
				amount=scanner.nextInt();
				balance+=amount;
				addBook(nameList, valueList, item, amount);
			} else if (menu==2) {
				System.out.print("내역 >> ");
				item=scanner.next();
				System.out.print("금액 >> ");
				amount=scanner.nextInt();
				balance-=amount;
				addBook(nameList, valueList, item, -amount);
			} else if (menu==3) {
				System.out.print("내역 >> ");
				item=scanner.next();
				balance-=removeBook(nameList, valueList, item);
			} else if (menu==4) {
				showBook(nameList, valueList, balance);
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		scanner.close();
	}
	
	public static void addBook(String[] nameList, int[] valueList, String item, int amount) {
		for (int i=0; i<nameList.length;i++) {
			if(nameList[i]==null) {	// 비어있는 곳에 저장 	
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
				System.out.println(item+" 삭제됨");
				break;
			}
		}
		return value;	// 삭제된 만큼 잔액을 돌려주어야함, 함수 int 타입
		
	}
	
	public static void showBook(String[] nameList, int[] valueList, int balance) {
		for (int i=0;i<nameList.length;i++) {
			if(nameList[i]!=null) {
				System.out.printf("%s: %d원\n",nameList[i],valueList[i]);
			}
		}
		System.out.println("잔액: "+balance+"원");
	}

}
