import java.util.Scanner;




public class day21_3_8 {

	public static void main(String[] args) {
		//  \n����  \r�س�
		//�������͵��ô�		��������  Boolean Character Integer	Double
		//��ȡ�����͵������Сֵ    Integer.MIN_VALYE  Integer.MAX_VALYE 
		//�÷�
		System.out.println(Integer.MAX_VALUE);
//		Character.idDigit(char ch) �ж�����ַ��ǲ�������
//		Character.isLetter(char ch) �ж�����ַ��ǲ�����ĸ
//		Character.isLetterOrDigit(char ch) �ж�����ַ��ǲ�����ĸ������
//		Character.isLowerCase(char ch) �ж�����ַ��ǲ���Сд��ĸ
//		Character.isUpperCase(char ch) �ж�����ַ��ǲ��Ǵ�д��ĸ
//		Character.isWhitespace(char ch) �ж������ĸ�ǲ���һ�ֿո�
//		Character.toLowerCase(char ch) �������ĸת����Сд
//		Character.toUpperCase(char ch) �������ĸת���ɴ�д
		//�÷�
		System.out.println(Character.isDigit('1'));//ע��char�������õ�������ֻ������һ���ַ�
		
		
		//Math��
		//abs pow random  round
		//�÷�
		System.out.println(Math.abs(-10));//�����ֵ
		System.out.println(Math.round(6.66));//�����ֽ�����������
		System.out.println(Math.random()*100);//0-1���//*100�ͱ��0-100
		System.out.println(Math.pow(2,3));//���и�������ģ���ʾ2�����η�
	}
}
