package labtwo;

import java.util.Scanner;

public class Bookstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		Book[] bookList=new Book[10];
		
		while(true) {
			System.out.print("1=입력 2=삭제 3=출력 4=종료>> ");
			int menu=scanner.nextInt();
			scanner.nextLine();
			
			if (menu==1) {
				System.out.print("제목>> ");
				String title=scanner.nextLine();
				System.out.print("저자>> ");
				String author=scanner.nextLine();
				System.out.print("가격>> ");
				int price=scanner.nextInt();
				System.out.print("개수>> ");
				int number=scanner.nextInt();

				addBookList(bookList,title,author,price,number);
			} else if (menu==2) {
				System.out.print("삭제할 도서의 제목>> ");
				String title=scanner.next();
				delBookList(bookList, title);
			} else if (menu==3) {
				showBookList(bookList);
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		scanner.close();
	}
	
	public static void addBookList(Book []bookList, String title, String author, int price, int number) {
		int i=0;
		for (i=0;i<bookList.length;i++) {
			if(bookList[i]==null) {
				bookList[i]=new Book(title,author,price,number);
				break;
			}
			
		}
		if(i==bookList.length) {
			System.out.print("더 이상 입력할 수 없습니다");
		}
	}
	
	public static void delBookList(Book []bookList, String title) {
		int i=0;
		for (i=0;i<bookList.length;i++) {
			if(bookList[i].extractTitle().equals(title)) {
				bookList[i]=null;
				System.out.println("삭제되었습니다.");
				
				for (int j=i;j<bookList.length-1;j++) {
	                bookList[j]=bookList[j+1];
	            }
				bookList[bookList.length - 1] = null;
				break;
			}
		}
		if(i==bookList.length) {
			System.out.print("책을 찾을 수 없습니다");
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
		System.out.printf("총액 %d원\n", totalPrice);
	}

}
