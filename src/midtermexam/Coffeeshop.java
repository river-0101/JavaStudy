package midtermexam;

import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		Coffee[] coffeeList = new Coffee[10];
		coffeeList[0] = new Coffee("īǪġ��", 5000, 50);
		coffeeList[1] = new Coffee("�Ƹ޸�ī��", 4000, 100);
		coffeeList[2] = new Coffee("��", 4500, 80);
		
		System.out.println("���α׷��� �����մϴ�.");

		while (true) {
			System.out.print("1=�Է� 2=���� 3=���ݺ��� 4=��� 5=����>> ");
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
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}

	}

	static void addCoffee(Coffee[] coffeeList, Scanner scanner) {
		int i = 0;
		System.out.print("�̸�>> ");
		String name = scanner.nextLine();
		System.out.print("����>> ");
		int price = scanner.nextInt();
		System.out.print("����>> ");
		int num = scanner.nextInt();

		for (i = 0; i < coffeeList.length; i++) {
			if (coffeeList[i] == null) {
				coffeeList[i] = new Coffee(name, price, num);
				System.out.println(name + " �߰��Ǿ����ϴ�.");
				break;
			}
			if (i == coffeeList.length) {
				System.out.println("�� �̻� ������ �����ϴ�.");
			}
		}

	}

	static void removeCoffee(Coffee[] coffeeList, Scanner scanner) {
		int i = 0;
		System.out.print("������ Ŀ�� �̸�>> ");
		String name = scanner.nextLine();

		for (i = 0; i < coffeeList.length; i++) {
			if (coffeeList[i] != null && coffeeList[i].extractCoffeeName().equals(name)) {
				coffeeList[i] = null;
				System.out.println(name + " �����Ǿ����ϴ�.");
				for (int j = i; j < coffeeList.length - 1; j++) {
					coffeeList[j] = coffeeList[j + 1];
				}
				return;
			}
		}
		System.out.println(name + " �����ϴ�.");

	}

	static void updatePrice(Coffee[] coffeeList, Scanner scanner) {
		int i = 0;
		System.out.print("������ ������ Ŀ�� �̸�>> ");
		String name = scanner.nextLine();
		System.out.print("���ο� ����>> ");
		int updatePrice = scanner.nextInt();
		
		for (i = 0; i < coffeeList.length; i++) {
			if (coffeeList[i] != null && coffeeList[i].extractCoffeeName().equals(name)) {
				int num = coffeeList[i].extractCoffeeNum();
				coffeeList[i] = null;
				coffeeList[i] = new Coffee(name, updatePrice, num);
				System.out.println(name + "�� ������ " + updatePrice + "������ ����Ǿ����ϴ�.");
				break;
			}
		}

	}

	static void printCoffeeList(Coffee[] coffeeList) {
		int totalPrice = 0;
		System.out.println("���� Ŀ�� ���:");
		for (int i = 0; i < coffeeList.length; i++) {
			if (coffeeList[i] != null) {
				coffeeList[i].showCoffeeInfo();
				totalPrice += coffeeList[i].totalPrice();
			}
		}
		System.out.printf("�Ѿ� %d��\n", totalPrice);
	}

}
