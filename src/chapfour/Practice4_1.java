package chapfour;

public class Practice4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []lotto=new int[6];
		for (int i=0;i<6;i++) {
			lotto[i]=(int)(Math.random()*45)+1; // random num 积己 规过 积阿窍扁
			System.out.print(lotto[i]+ " ");
		}
		System.out.println();
			
		for (int j=0; j<6; j++) {
			System.out.print((int)(Math.random()*45)+1);
			System.out.print(" ");
		}
		

	}

}
