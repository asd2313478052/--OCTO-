package asd;

import java.util.Scanner;

public class ZUOYE {
	public static void main(String[]args){
		
		String info ="";
		int[] scores=new int[]{};
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int index = 0;
		while(info!="y"){
			int score = input.nextInt();
			scores[index]=score;
			index++;
			info = input.next();
		}
		System.out.println(scores);
	}
}
