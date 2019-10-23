package cn.tedu.night02;

import java.util.Scanner;

public class Test2_Area {
	public static void main(String[] args) {
		System.out.println("请输入圆的半径：");
		//从键盘获取圆的半径数据
		double r = new Scanner(System.in).nextDouble();
		//输出结果
		System.out.println("该圆的面积为："+(3.14*r*r));
		System.out.println("该圆的周长为："+(3.14*2*r));
	}
}
