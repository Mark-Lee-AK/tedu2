package cn.tedu.night02;

import java.util.Scanner;

public class Test5_Max {
	public static void main(String[] args) {
		System.out.println("����������Ҫ�Ƚϵ����֣��ûس�������");
		// ����Ҫ�Ƚϵ���������
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();

		// ����һ��
		if (a > b) {
			if (a > c) {
				System.out.println("����������������" + a);
			} else {
				System.out.println("����������������" + c);
			}
		} else if (b > c) {
			System.out.println("����������������" + b);
		} else {
			System.out.println("����������������" + c);
		}

		// ��������
		int max = a > b ? a : b;
		max = max > c ? max : c;
		System.out.println("����������������" + max);

		// ��������
		int max1 = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("����������������" + max1);

		// �����ģ�
		int max2 = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("����������������" + max2);
	}

}

//eclipse���ÿ�ݼ�
//shif +           	�س�������Ƶ���һ��
//alt  + ����        	���������ƶ�
//ctrl + D         	ɾ������
//ctrl + shif + o  	�Զ�����
//ctrl + /         	����ע�� �ٰ�һ��ȥ��
//ctrl + shif + /  	����ע��
//ctrl + shif + \  	ȡ������ע��
//ctrl + 1			���ܼ�
//if��for��whitch��do������ + alt + /		�Զ�����
//ctrl + shif + f   ��ʽ������