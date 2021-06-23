package asd;
/**
 * 一班成绩是98,54,67,32:；二班学生成绩是87,92,8；三班成绩是76,60,79,88，计算每个班同学总成绩，并输出
 * 
 *
 */
public class T01 {
	public static void main(String[]args){
	int[][]array=new int[][]{{98,54,67,32},{87,92,8},{76,60,79,88}};
	//定义二维数组、分配空间、赋值
	int total;     //b保存总成绩
	for(int i = 0;i < array.length;i++){
		String str = (i+1)+"班";
		total = 0; //每次循环到此都将归0
		for(int j = 0;j<array[i].length;j++){
			total += array[i][j];   //成绩累加
			
		}
		System.out.println(str+"总成绩："+total);
	}
	}

}
