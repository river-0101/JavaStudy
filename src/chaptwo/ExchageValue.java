package chaptwo;

// x, y 값 서로 교환
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
