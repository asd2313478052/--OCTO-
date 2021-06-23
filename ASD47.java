package asd;

import java.util.Scanner;

public class ASD47 {
	public static void main(String[]args){
		int count = 0;
		int maxScore = 0;
		System.out.println("请输入学生人数：");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		System.out.println("请输入"+count+"个学生成绩：");
		int[]scores = new int[count];
		for(int i = 0;i<count;i++){
			scores[i]=scanner.nextInt();
	
			if (scores[i]>maxScore){
				maxScore = scores[i];
			}
		}
			System.out.println("最高分是："+maxScore);
			
			for(int s = 0;s<scores.length;s++){
				if((maxScore - 10)<scores[s]&&scores[s]<=maxScore){
					System.out.println("第"+s+"个学生的成绩是："+scores[s]+"等级是：A");
				}else if((maxScore - 20)<scores[s]&&scores[s]<=(maxScore-10)){
					System.out.println("第"+s+"个学生的成绩是："+scores[s]+"等级是：B");
				}else if((maxScore - 30)<scores[s]&&scores[s]<=(maxScore-20)){
					System.out.println("第"+s+"个学生的成绩是："+scores[s]+"等级是：C");
				}else{
					System.out.println("第"+s+"个学生的成绩是："+scores[s]+"等级是：D");
				}
			}
			
			
			
			
		}
	}


