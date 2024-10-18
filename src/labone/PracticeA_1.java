package labone;

// ++, ----, ******, //////
public class PracticeA_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]myCh= {'+','-','*','/'};
		
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=i*2; j++) {
				System.out.print(myCh[i-1]);
			}
			System.out.println();
		}

	}

}
