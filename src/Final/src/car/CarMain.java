package car;

public class CarMain {

	public static void main(String[] args) {
		// ù ��° �ó�����
		Car myCar = new Car();
		// ������ Ÿ�̾ �ٿ��� run
		System.out.println("ù ��° �ó�����:");
		Engine myEngine = new HyundaiEngine();
		Tire myTire = new HankookTire();
		myCar.attachEngine(myEngine);
		myCar.attachTire(myTire);
		// �ڵ��� ����
		myCar.run();
		System.out.println();
		// �� ��° �ó�����
		System.out.println("�� ��° �ó�����:");
		// ���� ������ ��Ȱ���Ͽ� �ٸ� �귣���� ������ Ÿ�̾ �ٿ��� run
		myEngine = new KiaEngine();
		myTire = new MichelinTire();
		myCar.attachEngine(myEngine);
		myCar.attachTire(myTire);
		// �ڵ��� ����
		myCar.run();
	}

}

// Component �������̽� ����
interface Component {
	void attach();
}

// Operation �������̽� ����
interface Operation {
	void run();

	void stop();
}

// Engine �������̽�
interface Engine extends Component, Operation {
}

// Tire �������̽�
interface Tire extends Component, Operation {
}

// HyundaiEngine Ŭ����
class HyundaiEngine implements Engine {
	@Override
	public void attach() {
		System.out.println("���� ������ �����߽��ϴ�.");
	}

	@Override
	public void run() {
		System.out.println("���� ������ �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("���� ������ �����մϴ�.");
	}
}

// HankookTire Ŭ����
class HankookTire implements Tire {
	@Override
	public void attach() {
		System.out.println("�ѱ� Ÿ�̾ �����߽��ϴ�.");
	}

	@Override
	public void run() {
		System.out.println("�ѱ� Ÿ�̾ ȸ���մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�ѱ� Ÿ�̾ �����մϴ�.");
	}
}

// KiaEngine Ŭ����
class KiaEngine implements Engine {
	@Override
	public void attach() {
		System.out.println("��� ������ �����߽��ϴ�.");
	}

	@Override
	public void run() {
		System.out.println("��� ������ �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("��� ������ �����մϴ�.");
	}
}

// MichelinTire Ŭ����
class MichelinTire implements Tire {
	@Override
	public void attach() {
		System.out.println("�̽��� Ÿ�̾ �����߽��ϴ�.");
	}

	@Override
	public void run() {
		System.out.println("�̽��� Ÿ�̾ ȸ���մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�̽��� Ÿ�̾ �����մϴ�.");
	}
}

// Car Ŭ����
class Car {
	private Engine myEngine;
	private Tire myTire;

	public void attachEngine(Engine engine) {
		myEngine = engine;
		myEngine.attach();
	}

	public void attachTire(Tire tire) {
		myTire = tire;
		myTire.attach();
	}

	public void run() {
		System.out.println("�ڵ����� �����Դϴ�.");
		myEngine.run();
		myTire.run();
		myEngine.stop();
		myTire.stop();
	}
}
