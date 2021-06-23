package asd;

public class ZHISHU {
	public static void main(String[]args){
		int f=100;
		System.out.println(f+"以内的质数是：");
		System.out.println(1);
		System.out.println(2);
		for(int i=2;i < f ;i++){
			
			for(int j =2;j<=i;j++){
				if(i%j==0){
					
					break;
				}
				if(j==(i-1)){
					System.out.println(i);
				}
			}
		}
	}

}
