


import java.util.Scanner;
	//final=C++中的const
	//计算优先级忘记方法：直接加括号
	//强制转化：   int=(int)6.6   //把浮点型变量强制转化为int

public class day21_3_7 {
	   public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int C;
		int F ;
		System.out.print("请输入华氏温度：");
		F=in.nextInt();
		System.out.println(C = 5*(F-32)/9);
	  }
}
