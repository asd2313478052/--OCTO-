package asd;



import java.util.Scanner;

public class HeHehE {
	public static void main(String[] args){
		int custNo;
		System.out.println("dsadasd:");
		Scanner inpu=new Scanner(System.in);
		custNo=inpu.nextInt();
		System.out.println("dhdhdh:"+custNo);
		int a = custNo / 1000 ;
		int b = custNo / 100 % 10;
		int c = custNo / 10 % 10;
		int d = custNo % 10;
		System.out.println("千位数："+ a +",百位数："+ b + ",十位数："+ c +",个位数：" + d );
		int sum = a+b+c+d;
		System.out.println("会员卡号各位数之和："+ sum );
		if  (sum > 20) {
			System.out.println("会员卡号"+ custNo + "的会员，您中奖了！奖品是MP3！");
		}else{
			System.out.println("会员卡号"+custNo+"的会员，您没有中奖。");
		}
	}

}
