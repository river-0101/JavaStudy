package chapTwo;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		//결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		
		String str2 = "10" + 2 + 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" + (2 + 8);
		System.out.println("str3: " + str3);
		
		String str4 = 3 + 3.0 + "10";
		System.out.println("str4: "+ str4);

	}

}
