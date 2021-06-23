package asd;

import java.util.Scanner;

public class ZUOYE {
	public static void main(String[]args){
		
		String info ="";
		int[] scores=new int[]{};
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
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
