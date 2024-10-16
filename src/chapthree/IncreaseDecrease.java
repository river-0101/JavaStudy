package chapthree;

public class IncreaseDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		// 변수 뒤에 올경우 결과값 주의

		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");		
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");				
		z = ++x + y++;
		// z = 15 + 8 -> y는 계산 후 더해지니 y = 9
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}
