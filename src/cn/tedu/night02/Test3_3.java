package cn.tedu.night02;

import java.util.Scanner;

public class Test3_3 {
public static void main(String[] args) {
	
	//���̽������֣�����ֵ��a��b��c����
	int a = new Scanner(System.in).nextInt();
	int b = new Scanner(System.in).nextInt();
	int c = new Scanner(System.in).nextInt();
	
	//��ӡ��ʾԭʼ��˳��
	System.out.println("�������˳�������ǣ�");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	//����A��B��λ��
	int t = a;
	a = b;
	b = t;
	
	//��ӡ����A��B��λ�ú��˳��
	System.out.println("��һ�ν���˳���");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	//����B��C��λ��
	t = b;
	b = c;
	c = t;
	
	//��ӡ����B��C��λ�ú��˳��
	System.out.println("�ڶ��ν���˳���");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}
