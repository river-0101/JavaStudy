package shape;

public class ShapeDrawApp {

	public static void main(String[] args) {
		Shape[] list = new Shape[3];
		list[0] = new Circle(10); // ������ 10�� ��
		list[1] = new Oval(20, 30); // 20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect(10, 40); // 10x40 ũ���� �簢��

		for (int i = 0; i < list.length; i++)
			list[i].redraw();

		for (int i = 0; i < list.length; i++)
			System.out.println("������ " + list[i].getArea());
	}

}

interface Shape {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle implements Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");

	}

	@Override
	public double getArea() {
		return radius * radius * PI;
	}

}

class Oval implements Shape {
	int width;
	int height;

	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + "x" + height + " �簢���� �����ϴ� Ÿ���Դϴ�.");

	}

	@Override
	public double getArea() {
		return width * height * PI;
	}

}

class Rect implements Shape {
	int width;
	int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + "x" + height + " ũ���� �簢���Դϴ�.");
	}

	@Override
	public double getArea() {
		return width * height;
	}

}