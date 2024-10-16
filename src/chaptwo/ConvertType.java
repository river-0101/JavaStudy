package chaptwo;

public class ConvertType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 각각 타입으로 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		// 각각의 타입으로 된 값을 문자열 타입으로 변환
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);		
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		
	}

}
