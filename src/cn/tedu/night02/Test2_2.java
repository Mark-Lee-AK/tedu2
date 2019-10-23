package cn.tedu.night02;

import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {
		System.out.println("请输入圆的半径：");
		//半径的输入和赋值
		double r = new Scanner(System.in).nextDouble();
		
		//直接再输出是运算结果，不需要再申请多余的空间存放面积和周长
		System.out.println("这个圆的面积是"+3.14*Math.pow(r,2));
		System.out.println("这个圆的周长是"+3.14*2*r);
	}
}
