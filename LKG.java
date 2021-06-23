package asd;
import java.util.Scanner;

public class LKG {
	public static void main(String[] args){
		int moth = 0;
		System.out.println("请输入月份：");
		
		Scanner input = new Scanner (System.in);
		moth = input.nextInt();
		String season = "";
		int[][] moths = {{3,4,5},{6,7,8},{9,10,11},{12,1,2}};
		for(int i=0; i < moths.length ; i++) {
			for(int j=0;j<3;j++){
				if(moth==moths[i][j]){
					switch(i){
					case 0:
						season ="春季";
						break;
					case 1:
						season = "夏季";
						break;
					case 2:
						season="秋季";
						break;
					case  3:
						season="冬季";
						break;
					}
					
					System.out.println(moth+"的对应季节是："+season);
					
					break;
				}
				}
		
			}
	}

}
