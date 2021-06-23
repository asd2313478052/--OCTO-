package asd;

import java.util.Scanner;

/**
 * s升序
 * @author student
 *
 */
public class T03 {
	public static void main(String[]args){
		
		System.out.println("请输入要插入的学生成绩：");
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		int[]scores = {60,82,99,85,63};
		int[] newScores = new int[scores.length+1];
		
		for(int i =0;i<scores.length;i++){
			newScores[i]=scores[i];
		}
			newScores[scores.length]=score;
			
			
			for(int i =0;i<newScores.length;i++){
				for(int j =0;j<newScores.length-1;j++){
					
				if(j+1==newScores.length)break;
				if (newScores[j]>newScores[j+1]){
					
					int tmp = newScores[j+1];
					newScores[j+1]= newScores[j];
					newScores[j]=tmp;
					
				}
		
			}
			
		}
		for(int i =0;i<newScores.length;i++){
			System.out.println(newScores[i]);
		}
		
	}

}
