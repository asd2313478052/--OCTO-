package asd;
/**
 * ��һ��ѧԺ�ĳɼ�{60,85,82,63,60}����
 * ѡ������n^2
 *
 */
public class T02 {
	public static void main(String[]args){
	//ÿһ��ѭ�����ҵ������е����ֵ
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
