package cn.tedu.night02;

import java.util.Scanner;

public class Test5_Max {
	public static void main(String[] args) {
		System.out.println("请输入三个要比较的数字，用回车隔开：");
		// 输入要比较的三个数字
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();

		// 方法一：
		if (a > b) {
			if (a > c) {
				System.out.println("这三个字中最大的是" + a);
			} else {
				System.out.println("这三个字中最大的是" + c);
			}
		} else if (b > c) {
			System.out.println("这三个字中最大的是" + b);
		} else {
			System.out.println("这三个字中最大的是" + c);
		}

		// 方法二：
		int max = a > b ? a : b;
		max = max > c ? max : c;
		System.out.println("这三个数中最大的是" + max);

		// 方法三：
		int max1 = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("这三个数中最大的是" + max1);

		// 方法四：
		int max2 = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("这三个数中最大的是" + max2);
	}

}

//eclipse常用快捷键
//shif +           	回车，光标移到下一行
//alt  + ↑↓        	整行上下移动
//ctrl + D         	删除整行
//ctrl + shif + o  	自动导包
//ctrl + /         	当行注释 再按一次去掉
//ctrl + shif + /  	多行注释
//ctrl + shif + \  	取消多行注释
//ctrl + 1			万能键
//if（for、whitch、do……） + alt + /		自动补齐
//ctrl + shif + f   格式化代码