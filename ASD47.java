package asd;

import java.util.Scanner;

public class ASD47 {
	public static void main(String[]args){
		int count = 0;
		int maxScore = 0;
		System.out.println("������ѧ��������");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		System.out.println("������"+count+"��ѧ���ɼ���");
		int[]scores = new int[count];
		for(int i = 0;i<count;i++){
			scores[i]=scanner.nextInt();
	
			if (scores[i]>maxScore){
				maxScore = scores[i];
			}
		}
			System.out.println("��߷��ǣ�"+maxScore);
			
			for(int s = 0;s<scores.length;s++){
				if((maxScore - 10)<scores[s]&&scores[s]<=maxScore){
					System.out.println("��"+s+"��ѧ���ĳɼ��ǣ�"+scores[s]+"�ȼ��ǣ�A");
				}else if((maxScore - 20)<scores[s]&&scores[s]<=(maxScore-10)){
					System.out.println("��"+s+"��ѧ���ĳɼ��ǣ�"+scores[s]+"�ȼ��ǣ�B");
				}else if((maxScore - 30)<scores[s]&&scores[s]<=(maxScore-20)){
					System.out.println("��"+s+"��ѧ���ĳɼ��ǣ�"+scores[s]+"�ȼ��ǣ�C");
				}else{
					System.out.println("��"+s+"��ѧ���ĳɼ��ǣ�"+scores[s]+"�ȼ��ǣ�D");
				}
			}
			
			
			
			
		}
	}


