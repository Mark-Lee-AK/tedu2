package cn.tedu.night02;

public class Test4_4 {
	public static void main(String[] args) {
	
		int a = 2;
		int b = 2;
		// 符号在后，先使用再改变；符号在前，先变化再使用
		System.out.println(a++);// 输出2
		System.out.println(++b);// 输出3
		// 此时的a和变都已经变成了3

		System.out.println(++a - b + a--);
		// 4-3+4=5
	}
}
