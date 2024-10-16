package chapThree;

public class CompareFloatType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //false, 0.1f는 0.1의 근사치, float는 소수를 정확하게 나타낼 수 없음
	
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true

	}

}
