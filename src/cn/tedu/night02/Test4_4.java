package cn.tedu.night02;

public class Test4_4 {
	public static void main(String[] args) {
	
		int a = 2;
		int b = 2;
		// �����ں���ʹ���ٸı䣻������ǰ���ȱ仯��ʹ��
		System.out.println(a++);// ���2
		System.out.println(++b);// ���3
		// ��ʱ��a�ͱ䶼�Ѿ������3

		System.out.println(++a - b + a--);
		// 4-3+4=5
	}
}
