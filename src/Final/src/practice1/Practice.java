package practice1;

public class Practice {
	public static void main(String[] args) {
		System.out.println("--- 인터페이스 다형성 테스트 ---");
		Person p1 = new Person("감자바", 30);
		Student p2 = new Student("김영희", 20, 123456);
		StudentWorker p3 = new StudentWorker("배철수", 22, 234567, 500);
		p1.speak();
		p2.speak();
		p2.study(); // Student 의 개별 메소드
		p3.speak();
		p3.play(); // 다중인터페이스, 디폴트 메소드에서 정의

		System.out.println("\n---- 인터페이스 필드 다형성 테스트 ----");
		Animal ani = new StudentWorker("홍길동", 25, 345678, 100);
		ani.speak();
		// ani.study(); // Animal 에서 정의된 것이 아님
		ani = p1;
		ani.speak();
		ani = p2;
		ani.speak();

		System.out.println("\n---- 인터페이스 강제형변환 테스트 ----");
		// ani.study(); // 인터페이스에 study 정의 안돼 있음
		if (ani instanceof Student) {
			Student pStu = (Student) ani;
			pStu.study();
		}

		System.out.println("\n---- 인터페이스 매개변수 다형성 테스트 ----");
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
		System.out.println("제 이름은 " + name + " 나이는 " + age + "살 입니다.");
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
		System.out.println("그리고 학번은 " + studentNo + " 입니다.");
	}

	void study() {
		System.out.println("자바 공부합시다.");
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
		System.out.println("그리고 월급은 " + salary + "만원 입니다.");
	}

	@Override
	public void play() {
		System.out.println("취미는 축구입니다.");
	}

	void work() {
		System.out.println("알바도 합니다.");
	}

}