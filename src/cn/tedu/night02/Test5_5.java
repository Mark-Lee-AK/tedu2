package cn.tedu.night02;

import java.util.Scanner;

public class Test5_5 {
	public static void main(String[] args) {
		System.out.println("������������Ч������");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		
		//����һ��
		int max;
		if (a > b) {
			if (a > c) {
				max = a;
			}else {max = c;}
		} else if (b > c) {
			max = b;
		}else {max = c;}
		System.out.println("���ֵΪ��"+max);
		
		//��������
		int max1 = a>b?a:b;
		max1 = max1>c?max:c;
		System.out.println("���ֵΪ��"+max1);
		
		//��������
		int max2;
		max2 = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("���ֵΪ��"+max2);
		
		//�����ģ�
		int max3;
		max3 = (a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("���ֵΪ��"+max3);
	}
}
