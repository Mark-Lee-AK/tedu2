package cn.tedu.night02;

import java.util.Scanner;

public class Test6_Years {
	public static void main(String[] args) {
		// ݔ�����
		System.out.println("Ոݔ����Ҫ��ԃ����ݣ�");
		int year = new Scanner(System.in).nextInt();
		String desc = "ƽ��";

		// ����һ��
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				desc = "����";
			}
		}
		if (year % 400 == 0) {
			desc = "����";
		}
		System.out.println("���ã�" + year + "����" + desc);

		// ��������
		String desc1 = "ƽ��";
		boolean a = year % 4 == 0 && year % 100 != 0;
		boolean b = year % 400 == 0;
		if (a || b) {
			desc1 = "����";
		}
		System.out.println("��ã�" + year + "����" + desc1);

	}
}
