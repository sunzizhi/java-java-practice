import java.util.Scanner;


public class Day21_3_9 {
	public static void main(String[] args) {
		//第一点
//		String s=new String("hello");
//		System.out.println(s+12);//输出结果为hello12
//		System.out.println(s+12+24);//输出结果为hello1224
//		//因为一边是字符串一边不是字符串是，不是字符串的会被表达为字符串输出
//		
//		//第二点
//		Scanner in=new Scanner(System.in);
//		String a;
//		String b;
//		a=in.next();//当输入的字符里有空格就结束
//		System.out.println(a);
//		b=in.nextLine();//当输入到回车就结束
//		System.out.println(b);
//		
//		//第三点
//		if(a=="bye"){
//			//比较是否同一个东西//指向同一个地方
//		}
//		if (b.equals("bye")){
//			//比较内容是否相同
//		}
		
		//第四点  比较俩个字符串的大小
//		String s1="abc";
//		String s2="abcd";
//		System.out.println(s1.compareTo(s2));//输出-1
		
		//第五点      获取String的长度  用length()函数
//		String name="hellola",str1="one",str2="",str3;
//		System.out.println(name.length());//7
//		System.out.println(str1.length());//3
//		System.out.println(str2.length());//0
		//System.out.println(str3.length()); //报错，因为没有初始化字符
		
		//第六点    访问String里面的字符   charAt(index)   index的范围是length-1,起始为0和数组一样
		//不能用for-each循环遍历字符串
		String s4="01234567汉字";
		System.out.println(s4.charAt(0));//0
		for(int i=0;i<s4.length();i++)
		{
			System.out.println(s4.charAt(i));
		}
		
		//第七点
//		String s5="01234567汉字";
//		System.out.println(s5.substring(2));//从2号位开始输出//234567汉字
//		System.out.println(s5.substring(2,4));//从2号位开始输出到4号位前的//23
//		
		//第八点
		String s6="hello";
		int i=s6.length();
		System.out.println(s6+"bye");
		
		//第九点  本地变量的生存期和作用域
		//大括号内————块，出了大括号就没用了
		
	}
}
