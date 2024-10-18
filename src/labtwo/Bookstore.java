package labtwo;

import java.util.Scanner;

public class Bookstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		Book book1=new Book("어린왕자", "생텍쥐페리");
		Book book2=new Book("춘향전");
		Book[] bookList=new Book[10];
		
		book1.showBookInfosimple();
		book2.showBookInfosimple();
		System.out.println();
		
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
				int count=scanner.nextInt();

				addBookList(bookList,title,author,price,count);
			} else if (menu==2) {
				System.out.print("삭제할 도서의 제목>> ");
				String title=scanner.next();
				delBookList(bookList, title);
				System.out.println("삭제되었습니다.");
			} else if (menu==3) {
				showBookList(bookList);
			} else {
				System.out.println("프로그램을 종료합니다.");
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
				System.out.println(title+" 삭제됨");
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
		System.out.printf("총액 %d원\n", totalPrice);
	}

}
