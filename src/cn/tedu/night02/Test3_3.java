package cn.tedu.night02;

import java.util.Scanner;

public class Test3_3 {
public static void main(String[] args) {
	
	//键盘接收数字，并赋值再a、b、c里面
	int a = new Scanner(System.in).nextInt();
	int b = new Scanner(System.in).nextInt();
	int c = new Scanner(System.in).nextInt();
	
	//打印显示原始的顺序
	System.out.println("您输入的顺序依次是：");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	//交换A和B的位置
	int t = a;
	a = b;
	b = t;
	
	//打印交换A和B的位置后的顺序
	System.out.println("第一次交换顺序后：");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	//交换B和C的位置
	t = b;
	b = c;
	c = t;
	
	//打印交换B和C的位置后的顺序
	System.out.println("第二次交换顺序后：");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}
