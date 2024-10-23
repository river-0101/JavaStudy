package midtermexam;

public class Coffee {

	public String name;
	public int price, num;

	public Coffee(String name, int price, int num) {
		this.name = name;
		this.price = price;
		this.num = num;
	}

	public String extractCoffeeName() {
		return name;
	}
	
	public int extractCoffeeNum() {
		return num;
	}
	
	public int extractCoffeePrice() {
		return price;
	}

	public int totalPrice() {
		return price*num;		
	}
	
	public void showCoffeeInfo() {
		int sumPrice = price * num;
		System.out.println("Ŀ��: " + name + " ���� " + price + "�� ��� " + num + "�� �Ѿ� " + sumPrice + "��");
	}

}
