package asd;
import java.util.Scanner;
public class AAAAA {
	public static void main(String[]args){
	System.out.println("请输入一个整数计算1到该整数的值：");
	Scanner scanner = new Scanner(System.in);
	long last = scanner.nextInt();
	int sum = 0;
	for(int i=1;i<=last;i++){
		sum +=i;
	}
	System.out.println(sum);
	}

			

}
