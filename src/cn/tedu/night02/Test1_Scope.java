package cn.tedu.night02;

public class Test1_Scope {
	public static void main(String[] args) {
		//整数型数据类型的最大和最小值
		byte bmax = Byte.MAX_VALUE;
		byte bmin = Byte.MIN_VALUE;
		short smax = Short.MAX_VALUE;
		short smin = Short.MIN_VALUE;
		int imax = Integer.MAX_VALUE;
		int imin = Integer.MIN_VALUE;
		long lmax = Long.MAX_VALUE;
		long lmin = Long.MIN_VALUE;
		System.out.println("byte类型的最大值是："+bmax);
		System.out.println("byte类型的最小值是："+bmin);
		System.out.println("short类型的最大值是："+smax);
		System.out.println("short类型的最小值是："+smin);
		System.out.println("int类型的最大值是："+imax);
		System.out.println("int类型的最小值是："+imin);
		System.out.println("long类型的最大值是："+lmax);
		System.out.println("long类型的最小值是："+lmin);
		
		//-------------------------------------------
		//浮点型数据类型的最大值和最小值
		float fmax = Float.MAX_VALUE;
		float fmin = Float.MIN_VALUE;
		double dmax = Double.MAX_VALUE;
		double dmin = Double.MIN_VALUE;
		System.out.println("float类型的最大值是："+fmax);
		System.out.println("float类型的最小值是："+fmin);		
		System.out.println("double类型的最大值是："+dmax);
		System.out.println("double类型的最小值是："+dmin);	
		
		//-------------------------------------------
		//字符型
		char c1 = 'a';
		char c2 = '1';
		char c3 = '中';
		char c4 = 97;
		System.out.println("c1:"+c1+",c2:"+c2+",c3:"+c3+",c4:"+c4);
		//char类型赋值数字时，会根据ascii码表查找相对应的字符
		
		//-------------------------------------------
		//布尔型 boolean    -true  -false
		boolean x = true;
		boolean y = false;
		System.out.println(x);
	}
}
