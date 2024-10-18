package labtwo;

import java.util.Scanner;

public class Bookstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		Book book1=new Book("�����", "�������丮");
		Book book2=new Book("������");
		Book[] bookList=new Book[10];
		
		book1.showBookInfosimple();
		book2.showBookInfosimple();
		System.out.println();
		
		while(true) {
			System.out.print("1=�Է� 2=���� 3=��� 4=����>> ");
			int menu=scanner.nextInt();
			scanner.nextLine();
			
			if (menu==1) {
				System.out.print("����>> ");
				String title=scanner.nextLine();
				System.out.print("����>> ");
				String author=scanner.nextLine();
				System.out.print("����>> ");
				int price=scanner.nextInt();
				System.out.print("����>> ");
				int count=scanner.nextInt();

				addBookList(bookList,title,author,price,count);
			} else if (menu==2) {
				System.out.print("������ ������ ����>> ");
				String title=scanner.next();
				delBookList(bookList, title);
				System.out.println("�����Ǿ����ϴ�.");
			} else if (menu==3) {
				showBookList(bookList);
			} else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		scanner.close();
	}
	
	public static void addBookList(Book []bookList, String title, String author, int price, int count) {
		for (int i=0;i<bookList.length;i++) {
			if(bookList[i]==null) {
				bookList[i]=new Book(title,author,price,count);
				break;
			}
		}
	}
	
	public static void delBookList(Book []bookList, String title) {
		for (int i=0;i<bookList.length;i++) {
			if(bookList[i].extractTitle().equals(title)) {
				bookList[i]=null;
				System.out.println(title+" ������");
				break;
			}
		}
	}
	
	public static void showBookList(Book []bookList) {
		int totalPrice = 0;
		for (int i=0;i<bookList.length;i++) {
			if(bookList[i]!=null) {
				bookList[i].showBookInfo();
				totalPrice+=bookList[i].sumPrice();
			}
		}
		System.out.printf("�Ѿ� %d��\n", totalPrice);
	}

}
