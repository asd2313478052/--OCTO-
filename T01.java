package asd;
/**
 * һ��ɼ���98,54,67,32:������ѧ���ɼ���87,92,8������ɼ���76,60,79,88������ÿ����ͬѧ�ܳɼ��������
 * 
 *
 */
public class T01 {
	public static void main(String[]args){
	int[][]array=new int[][]{{98,54,67,32},{87,92,8},{76,60,79,88}};
	//�����ά���顢����ռ䡢��ֵ
	int total;     //b�����ܳɼ�
	for(int i = 0;i < array.length;i++){
		String str = (i+1)+"��";
		total = 0; //ÿ��ѭ�����˶�����0
		for(int j = 0;j<array[i].length;j++){
			total += array[i][j];   //�ɼ��ۼ�
			
		}
		System.out.println(str+"�ܳɼ���"+total);
	}
	}

}
