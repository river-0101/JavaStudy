package chaptwo;

// x, y �� ���� ��ȯ
public class ExchageValue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		System.out.println("x : "+x+ " y : "+y);
		
		int temp;
		temp = x;
		x = y;
		y= temp;
		System.out.println("x : "+x+" y : "+y);
	}

}
