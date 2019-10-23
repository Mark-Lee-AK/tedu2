package cn.tedu.night02;

import java.util.Scanner;

public class Test6_Years {
	public static void main(String[] args) {
		// 輸入年份
		System.out.println("請輸入您要查詢的年份：");
		int year = new Scanner(System.in).nextInt();
		String desc = "平年";

		// 方法一：
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				desc = "闰年";
			}
		}
		if (year % 400 == 0) {
			desc = "闰年";
		}
		System.out.println("您好！" + year + "年是" + desc);

		// 方法二：
		String desc1 = "平年";
		boolean a = year % 4 == 0 && year % 100 != 0;
		boolean b = year % 400 == 0;
		if (a || b) {
			desc1 = "闰年";
		}
		System.out.println("你好！" + year + "年是" + desc1);

	}
}
