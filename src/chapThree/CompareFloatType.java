package chapThree;

public class CompareFloatType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //false, 0.1f�� 0.1�� �ٻ�ġ, float�� �Ҽ��� ��Ȯ�ϰ� ��Ÿ�� �� ����
	
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true

	}

}
