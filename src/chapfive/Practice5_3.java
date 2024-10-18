package chapfive;

import java.util.Scanner;

public class Practice5_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int []scores = null;
		int studentNum=0;
		
		while(true) {
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			int menu=scanner.nextInt();
			
			if (menu==1) {
				System.out.print("학생 수 입력 >> ");
				studentNum=scanner.nextInt();
				scores=new int[studentNum];
			} else if (menu==2) {
				for (int i=0; i<studentNum;i++) {
					System.out.printf("%d번째 학생의 점수 입력 >> ", i+1);
					scores[i]=scanner.nextInt();
				}
			} else if (menu==3) {
				for (int i=0;i<studentNum;i++) {
					System.out.printf("%d번째 학생의 점수 : %d\n",i+1,scores[i]);
				}
				
			} else if (menu==4) {
				int max=0;
				double sum=0.0;
				for (int i=0;i<studentNum;i++) {
					if (scores[i]>max) {
						max=scores[i];
					}
					sum+=scores[i];
				}
				double avg=sum/studentNum;
				System.out.printf("최고점수 : %d ",max);
				System.out.printf("평균 : %.2f\n", avg);
			} else {
				System.out.println("종료해야지");
				break;
			}
			scanner.close();
		}
		
	}
	
}
