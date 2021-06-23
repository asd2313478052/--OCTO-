package asd;
/**
 * 有一组学院的成绩{60,85,82,63,60}降序
 * 选择排序n^2
 *
 */
public class T02 {
	public static void main(String[]args){
	//每一次循环，找到数组中的最大值
	int[] scores = {60,82,99,85,63};
	int max = 0;
	int index = 0;
	int[] tmpScores = new int[scores.length];
	
	
	for(int i = 0;i<scores.length;i++){
		
		for(int j =0;j<scores.length;j++){
			if(scores[j]>max){
				max = scores[j];
				index = j;
			}
		}
		tmpScores[i]=max;
		if(index>-1){
			scores[index]=0;
		}
		max=0;
		index=-1;
	}
	
	for(int i =0;i<tmpScores.length;i++){
		System.out.println(tmpScores[i]);
	}
	
	}

}
