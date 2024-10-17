package chaptwo;

public class Practice2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strSeven="7";
		String strPi="3.14";
		int a;
		float b;
		
		a=Integer.parseInt(strSeven);
		b=Float.parseFloat(strPi);
		
		double c=a+b;
		System.out.printf("%d + %.2f = %.2f",a,b,c); //printf 사용법 기억하기

	}

}
