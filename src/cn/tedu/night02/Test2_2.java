package cn.tedu.night02;

import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {
		System.out.println("������Բ�İ뾶��");
		//�뾶������͸�ֵ
		double r = new Scanner(System.in).nextDouble();
		
		//ֱ���������������������Ҫ���������Ŀռ���������ܳ�
		System.out.println("���Բ�������"+3.14*Math.pow(r,2));
		System.out.println("���Բ���ܳ���"+3.14*2*r);
	}
}
