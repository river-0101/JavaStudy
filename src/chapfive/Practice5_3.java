package chapfive;

import java.util.Scanner;

public class Practice5_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int []scores = null;
		int studentNum=0;
		
		while(true) {
			System.out.println("1.�л��� | 2.�����Է� | 3. ��������Ʈ | 4.�м� | 5.����");
			int menu=scanner.nextInt();
			
			if (menu==1) {
				System.out.print("�л� �� �Է� >> ");
				studentNum=scanner.nextInt();
				scores=new int[studentNum];
			} else if (menu==2) {
				for (int i=0; i<studentNum;i++) {
					System.out.printf("%d��° �л��� ���� �Է� >> ", i+1);
					scores[i]=scanner.nextInt();
				}
			} else if (menu==3) {
				for (int i=0;i<studentNum;i++) {
					System.out.printf("%d��° �л��� ���� : %d\n",i+1,scores[i]);
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
				System.out.printf("�ְ����� : %d ",max);
				System.out.printf("��� : %.2f\n", avg);
			} else {
				System.out.println("�����ؾ���");
				break;
			}
			scanner.close();
		}
		
	}
	
}
