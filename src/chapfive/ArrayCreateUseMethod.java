package chapfive;

public class ArrayCreateUseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = add( new int[] { 83, 90, 87 } ); // int[]scores=new int[]{83,90,87};
		double avg=mean(new int[] { 83, 90, 87 });
		System.out.println("ÃÑÇÕ : " + sum);	
		System.out.println();
		System.out.println("Æò±Õ : "+avg);
		
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	public static double mean(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		double avg=(double)sum/scores.length;
		return avg;
	}

}
