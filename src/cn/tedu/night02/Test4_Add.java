package cn.tedu.night02;

public class Test4_Add {
	public static void main(String[] args) {
		/*
		 * 符号在前，先变化再使用
		 * 符号灾后，先使用再变化
		 */
		//自增
		int a = 1;
		int b = 1;
		System.out.println(a++);//1
		System.out.println(++b);//2
		//a=2,b=2		
		System.out.println(++a+b-a++);//2
		//3+2-3=2
		
		//自减
		int x = 1;
		int y = 1;
		System.out.println(x--);//1
		System.out.println(--y);//0
		//x=0,y=0
		System.out.println(--x-y+x-y--);//-2
		//-1-0+(-1)-0=-2
	}
}
