package labtwo;

import java.util.Scanner;

public class PracticeB_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[] memory=new int[5];
		int max=0;
		
		System.out.println("양수 5개를 입력하세요.");
		for (int i=0; i<memory.length;i++) {
			memory[i]=scanner.nextInt();
			if(max<memory[i]) {
				max=memory[i];
			}
		}
		System.out.printf("가장 큰 수는 %d입니다.",max);
		scanner.close();
	}
}
