import java.util.Scanner;


public class Day21_3_9 {
	public static void main(String[] args) {
		//��һ��
//		String s=new String("hello");
//		System.out.println(s+12);//������Ϊhello12
//		System.out.println(s+12+24);//������Ϊhello1224
//		//��Ϊһ�����ַ���һ�߲����ַ����ǣ������ַ����Ļᱻ���Ϊ�ַ������
//		
//		//�ڶ���
//		Scanner in=new Scanner(System.in);
//		String a;
//		String b;
//		a=in.next();//��������ַ����пո�ͽ���
//		System.out.println(a);
//		b=in.nextLine();//�����뵽�س��ͽ���
//		System.out.println(b);
//		
//		//������
//		if(a=="bye"){
//			//�Ƚ��Ƿ�ͬһ������//ָ��ͬһ���ط�
//		}
//		if (b.equals("bye")){
//			//�Ƚ������Ƿ���ͬ
//		}
		
		//���ĵ�  �Ƚ������ַ����Ĵ�С
//		String s1="abc";
//		String s2="abcd";
//		System.out.println(s1.compareTo(s2));//���-1
		
		//�����      ��ȡString�ĳ���  ��length()����
//		String name="hellola",str1="one",str2="",str3;
//		System.out.println(name.length());//7
//		System.out.println(str1.length());//3
//		System.out.println(str2.length());//0
		//System.out.println(str3.length()); //������Ϊû�г�ʼ���ַ�
		
		//������    ����String������ַ�   charAt(index)   index�ķ�Χ��length-1,��ʼΪ0������һ��
		//������for-eachѭ�������ַ���
		String s4="01234567����";
		System.out.println(s4.charAt(0));//0
		for(int i=0;i<s4.length();i++)
		{
			System.out.println(s4.charAt(i));
		}
		
		//���ߵ�
//		String s5="01234567����";
//		System.out.println(s5.substring(2));//��2��λ��ʼ���//234567����
//		System.out.println(s5.substring(2,4));//��2��λ��ʼ�����4��λǰ��//23
//		
		//�ڰ˵�
		String s6="hello";
		int i=s6.length();
		System.out.println(s6+"bye");
		
		//�ھŵ�  ���ر����������ں�������
		//�������ڡ��������飬���˴����ž�û����
		
	}
}
