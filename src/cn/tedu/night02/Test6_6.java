package cn.tedu.night02;

import java.util.Scanner;

public class Test6_6 {
	public static void main(String[] args) {
		System.out.println("��������ݣ�");
		int year = new Scanner(System.in).nextInt();

		// ����һ��
		String desc = "ƽ��";
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				desc = "����";
			}
		} else if (year % 400 == 0) {
			desc = "����";
		}
		System.out.println(year + "����" + desc);

		// ��������
		String desc1 = "ƽ��";
		boolean a = year % 4 == 0 && year % 100 != 0;
		boolean b = year % 400 == 0;
		if (a || b) {
			desc1 = "����";
		}
		System.out.println(year + "����" + desc1);

		// ��������
		String desc2 = "ƽ��";
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			desc2 = "����";
		}
		System.out.println(year + "����" + desc2);
	}
}
