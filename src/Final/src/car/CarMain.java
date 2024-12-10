package car;

public class CarMain {

	public static void main(String[] args) {
		// 첫 번째 시나리오
		Car myCar = new Car();
		// 엔진과 타이어를 붙여서 run
		System.out.println("첫 번째 시나리오:");
		Engine myEngine = new HyundaiEngine();
		Tire myTire = new HankookTire();
		myCar.attachEngine(myEngine);
		myCar.attachTire(myTire);
		// 자동차 실행
		myCar.run();
		System.out.println();
		// 두 번째 시나리오
		System.out.println("두 번째 시나리오:");
		// 기존 변수를 재활용하여 다른 브랜드의 엔진과 타이어를 붙여서 run
		myEngine = new KiaEngine();
		myTire = new MichelinTire();
		myCar.attachEngine(myEngine);
		myCar.attachTire(myTire);
		// 자동차 실행
		myCar.run();
	}

}

// Component 인터페이스 정의
interface Component {
	void attach();
}

// Operation 인터페이스 정의
interface Operation {
	void run();

	void stop();
}

// Engine 인터페이스
interface Engine extends Component, Operation {
}

// Tire 인터페이스
interface Tire extends Component, Operation {
}

// HyundaiEngine 클래스
class HyundaiEngine implements Engine {
	@Override
	public void attach() {
		System.out.println("현대 엔진을 장착했습니다.");
	}

	@Override
	public void run() {
		System.out.println("현대 엔진이 동작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("현대 엔진이 정지합니다.");
	}
}

// HankookTire 클래스
class HankookTire implements Tire {
	@Override
	public void attach() {
		System.out.println("한국 타이어를 장착했습니다.");
	}

	@Override
	public void run() {
		System.out.println("한국 타이어가 회전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("한국 타이어가 정지합니다.");
	}
}

// KiaEngine 클래스
class KiaEngine implements Engine {
	@Override
	public void attach() {
		System.out.println("기아 엔진을 장착했습니다.");
	}

	@Override
	public void run() {
		System.out.println("기아 엔진이 동작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("기아 엔진이 정지합니다.");
	}
}

// MichelinTire 클래스
class MichelinTire implements Tire {
	@Override
	public void attach() {
		System.out.println("미쉘린 타이어를 장착했습니다.");
	}

	@Override
	public void run() {
		System.out.println("미쉘린 타이어가 회전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("미쉘린 타이어가 정지합니다.");
	}
}

// Car 클래스
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
		System.out.println("자동차가 움직입니다.");
		myEngine.run();
		myTire.run();
		myEngine.stop();
		myTire.stop();
	}
}
