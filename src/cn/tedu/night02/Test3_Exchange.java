package cn.tedu.night02;

import java.util.Scanner;

public class Test3_Exchange {
	public static void main(String[] args) {
		System.out.println("�밴˳������2��Ҫ�����������س���������");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		System.out.println("����������ֱַ�Ϊ"+a+"��"+b);
		int t = a;
		a = b;
		b = t;
		//��β���
		System.out.println("������ֱ�Ϊ"+a+"��"+b);
		System.out.println("������������c");
		int c = new Scanner(System.in).nextInt();
		t=c;
		c=b;
		b=t;
		//��β��ӣ�ԭ����b�Ѿ���ֵ��a��ֵ���������ó���cΪԭ��a��ֵ
		System.out.println("������ֱ�Ϊ"+b+"��"+c);
	}
}
