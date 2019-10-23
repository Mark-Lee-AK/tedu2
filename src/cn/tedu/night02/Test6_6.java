package cn.tedu.night02;

import java.util.Scanner;

public class Test6_6 {
	public static void main(String[] args) {
		System.out.println("请输入年份：");
		int year = new Scanner(System.in).nextInt();

		// 方法一：
		String desc = "平年";
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				desc = "闰年";
			}
		} else if (year % 400 == 0) {
			desc = "闰年";
		}
		System.out.println(year + "年是" + desc);

		// 方法二：
		String desc1 = "平年";
		boolean a = year % 4 == 0 && year % 100 != 0;
		boolean b = year % 400 == 0;
		if (a || b) {
			desc1 = "闰年";
		}
		System.out.println(year + "年是" + desc1);

		// 方法三：
		String desc2 = "平年";
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			desc2 = "闰年";
		}
		System.out.println(year + "年是" + desc2);
	}
}
