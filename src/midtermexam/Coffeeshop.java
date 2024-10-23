package midtermexam;

import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		Coffee[] coffeeList = new Coffee[10];
		coffeeList[0] = new Coffee("카푸치노", 5000, 50);
		coffeeList[1] = new Coffee("아메리카노", 4000, 100);
		coffeeList[2] = new Coffee("라떼", 4500, 80);
		
		System.out.println("프로그램을 시작합니다.");

		while (true) {
			System.out.print("1=입력 2=삭제 3=가격변경 4=출력 5=종료>> ");
			int menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 1) {
				addCoffee(coffeeList, scanner);
			} else if (menu == 2) {
				removeCoffee(coffeeList, scanner);
			} else if (menu==3) {
				updatePrice(coffeeList, scanner);
			} else if (menu == 4) {
				printCoffeeList(coffeeList);
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 명령입니다.");
			}
		}

	}

	static void addCoffee(Coffee[] coffeeList, Scanner scanner) {
		int i = 0;
		System.out.print("이름>> ");
		String name = scanner.nextLine();
		System.out.print("가격>> ");
		int price = scanner.nextInt();
		System.out.print("개수>> ");
		int num = scanner.nextInt();

		for (i = 0; i < coffeeList.length; i++) {
			if (coffeeList[i] == null) {
				coffeeList[i] = new Coffee(name, price, num);
				System.out.println(name + " 추가되었습니다.");
				break;
			}
			if (i == coffeeList.length) {
				System.out.println("더 이상 공간이 없습니다.");
			}
		}

	}

	static void removeCoffee(Coffee[] coffeeList, Scanner scanner) {
		int i = 0;
		System.out.print("삭제할 커피 이름>> ");
		String name = scanner.nextLine();

		for (i = 0; i < coffeeList.length; i++) {
			if (coffeeList[i] != null && coffeeList[i].extractCoffeeName().equals(name)) {
				coffeeList[i] = null;
				System.out.println(name + " 삭제되었습니다.");
				for (int j = i; j < coffeeList.length - 1; j++) {
					coffeeList[j] = coffeeList[j + 1];
				}
				return;
			}
		}
		System.out.println(name + " 없습니다.");

	}

	static void updatePrice(Coffee[] coffeeList, Scanner scanner) {
		int i = 0;
		System.out.print("가격을 변경할 커피 이름>> ");
		String name = scanner.nextLine();
		System.out.print("새로운 가격>> ");
		int updatePrice = scanner.nextInt();
		
		for (i = 0; i < coffeeList.length; i++) {
			if (coffeeList[i] != null && coffeeList[i].extractCoffeeName().equals(name)) {
				int num = coffeeList[i].extractCoffeeNum();
				coffeeList[i] = null;
				coffeeList[i] = new Coffee(name, updatePrice, num);
				System.out.println(name + "의 가격이 " + updatePrice + "원으로 변경되었습니다.");
				break;
			}
		}

	}

	static void printCoffeeList(Coffee[] coffeeList) {
		int totalPrice = 0;
		System.out.println("보유 커피 목록:");
		for (int i = 0; i < coffeeList.length; i++) {
			if (coffeeList[i] != null) {
				coffeeList[i].showCoffeeInfo();
				totalPrice += coffeeList[i].totalPrice();
			}
		}
		System.out.printf("총액 %d원\n", totalPrice);
	}

}
