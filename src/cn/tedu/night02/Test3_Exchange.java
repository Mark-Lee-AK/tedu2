package cn.tedu.night02;

import java.util.Scanner;

public class Test3_Exchange {
	public static void main(String[] args) {
		System.out.println("请按顺序输入2个要交换的数（回车隔开）：");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		System.out.println("您输入的数字分别为"+a+"和"+b);
		int t = a;
		a = b;
		b = t;
		//首尾相接
		System.out.println("交换后分别为"+a+"和"+b);
		System.out.println("请再输入数字c");
		int c = new Scanner(System.in).nextInt();
		t=c;
		c=b;
		b=t;
		//首尾相接，原来的b已经赋值了a的值，所以最后得出的c为原来a的值
		System.out.println("交换后分别为"+b+"和"+c);
	}
}
