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
		System.out.println("ǧλ����"+ a +",��λ����"+ b + ",ʮλ����"+ c +",��λ����" + d );
		int sum = a+b+c+d;
		System.out.println("��Ա���Ÿ�λ��֮�ͣ�"+ sum );
		if  (sum > 20) {
			System.out.println("��Ա����"+ custNo + "�Ļ�Ա�����н��ˣ���Ʒ��MP3��");
		}else{
			System.out.println("��Ա����"+custNo+"�Ļ�Ա����û���н���");
		}
	}

}
