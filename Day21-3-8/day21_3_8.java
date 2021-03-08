import java.util.Scanner;




public class day21_3_8 {

	public static void main(String[] args) {
		//  \n换行  \r回车
		//包裹类型的用处		包裹类型  Boolean Character Integer	Double
		//获取该类型的最大最小值    Integer.MIN_VALYE  Integer.MAX_VALYE 
		//用法
		System.out.println(Integer.MAX_VALUE);
//		Character.idDigit(char ch) 判断这个字符是不是数字
//		Character.isLetter(char ch) 判断这个字符是不是字母
//		Character.isLetterOrDigit(char ch) 判断这个字符是不是字母或数字
//		Character.isLowerCase(char ch) 判断这个字符是不是小写字母
//		Character.isUpperCase(char ch) 判断这个字符是不是大写字母
//		Character.isWhitespace(char ch) 判断这个字母是不是一种空格
//		Character.toLowerCase(char ch) 把这个字母转换成小写
//		Character.toUpperCase(char ch) 把这个字母转换成大写
		//用法
		System.out.println(Character.isDigit('1'));//注意char类型是用单引号且只能输入一个字符
		
		
		//Math类
		//abs pow random  round
		//用法
		System.out.println(Math.abs(-10));//求绝对值
		System.out.println(Math.round(6.66));//对数字进行四舍五入
		System.out.println(Math.random()*100);//0-1随机//*100就变成0-100
		System.out.println(Math.pow(2,3));//进行浮点运算的，表示2的三次方
	}
}
