package practice1;

public class Practice {
	public static void main(String[] args) {
		System.out.println("--- �������̽� ������ �׽�Ʈ ---");
		Person p1 = new Person("���ڹ�", 30);
		Student p2 = new Student("�迵��", 20, 123456);
		StudentWorker p3 = new StudentWorker("��ö��", 22, 234567, 500);
		p1.speak();
		p2.speak();
		p2.study(); // Student �� ���� �޼ҵ�
		p3.speak();
		p3.play(); // �����������̽�, ����Ʈ �޼ҵ忡�� ����

		System.out.println("\n---- �������̽� �ʵ� ������ �׽�Ʈ ----");
		Animal ani = new StudentWorker("ȫ�浿", 25, 345678, 100);
		ani.speak();
		// ani.study(); // Animal ���� ���ǵ� ���� �ƴ�
		ani = p1;
		ani.speak();
		ani = p2;
		ani.speak();

		System.out.println("\n---- �������̽� ��������ȯ �׽�Ʈ ----");
		// ani.study(); // �������̽��� study ���� �ȵ� ����
		if (ani instanceof Student) {
			Student pStu = (Student) ani;
			pStu.study();
		}

		System.out.println("\n---- �������̽� �Ű����� ������ �׽�Ʈ ----");
		animalSpeak(p1);
		animalSpeak(p2);
		animalSpeak(p3);
		playerPlay(p3);

	}

	public static void animalSpeak(Animal animal) {
		animal.speak();
	}

	public static void playerPlay(Player player) {
		player.play();
	}

}

interface Animal {
	public void speak();
}

interface Player {
	public void play();
}

class Person implements Animal {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void speak() {
		System.out.println("�� �̸��� " + name + " ���̴� " + age + "�� �Դϴ�.");
	}
}

class Student extends Person {
	public int studentNo;

	public Student(String name, int age, int studentNo) {
		super(name, age);
		this.studentNo = studentNo;
	}

	@Override
	public void speak() {
		super.speak();
		System.out.println("�׸��� �й��� " + studentNo + " �Դϴ�.");
	}

	void study() {
		System.out.println("�ڹ� �����սô�.");
	}
}

class StudentWorker extends Student implements Player {
	int salary;

	public StudentWorker(String name, int age, int studentNo, int salary) {
		super(name, age, studentNo);
		this.salary = salary;
	}

	@Override
	public void speak() {
		super.speak();
		System.out.println("�׸��� ������ " + salary + "���� �Դϴ�.");
	}

	@Override
	public void play() {
		System.out.println("��̴� �౸�Դϴ�.");
	}

	void work() {
		System.out.println("�˹ٵ� �մϴ�.");
	}

}