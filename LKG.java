package asd;
import java.util.Scanner;

public class LKG {
	public static void main(String[] args){
		int moth = 0;
		System.out.println("�������·ݣ�");
		
		Scanner input = new Scanner (System.in);
		moth = input.nextInt();
		String season = "";
		int[][] moths = {{3,4,5},{6,7,8},{9,10,11},{12,1,2}};
		for(int i=0; i < moths.length ; i++) {
			for(int j=0;j<3;j++){
				if(moth==moths[i][j]){
					switch(i){
					case 0:
						season ="����";
						break;
					case 1:
						season = "�ļ�";
						break;
					case 2:
						season="�＾";
						break;
					case  3:
						season="����";
						break;
					}
					
					System.out.println(moth+"�Ķ�Ӧ�����ǣ�"+season);
					
					break;
				}
				}
		
			}
	}

}
