package cn.tedu.night02;

public class Test1_Scope {
	public static void main(String[] args) {
		//�������������͵�������Сֵ
		byte bmax = Byte.MAX_VALUE;
		byte bmin = Byte.MIN_VALUE;
		short smax = Short.MAX_VALUE;
		short smin = Short.MIN_VALUE;
		int imax = Integer.MAX_VALUE;
		int imin = Integer.MIN_VALUE;
		long lmax = Long.MAX_VALUE;
		long lmin = Long.MIN_VALUE;
		System.out.println("byte���͵����ֵ�ǣ�"+bmax);
		System.out.println("byte���͵���Сֵ�ǣ�"+bmin);
		System.out.println("short���͵����ֵ�ǣ�"+smax);
		System.out.println("short���͵���Сֵ�ǣ�"+smin);
		System.out.println("int���͵����ֵ�ǣ�"+imax);
		System.out.println("int���͵���Сֵ�ǣ�"+imin);
		System.out.println("long���͵����ֵ�ǣ�"+lmax);
		System.out.println("long���͵���Сֵ�ǣ�"+lmin);
		
		//-------------------------------------------
		//�������������͵����ֵ����Сֵ
		float fmax = Float.MAX_VALUE;
		float fmin = Float.MIN_VALUE;
		double dmax = Double.MAX_VALUE;
		double dmin = Double.MIN_VALUE;
		System.out.println("float���͵����ֵ�ǣ�"+fmax);
		System.out.println("float���͵���Сֵ�ǣ�"+fmin);		
		System.out.println("double���͵����ֵ�ǣ�"+dmax);
		System.out.println("double���͵���Сֵ�ǣ�"+dmin);	
		
		//-------------------------------------------
		//�ַ���
		char c1 = 'a';
		char c2 = '1';
		char c3 = '��';
		char c4 = 97;
		System.out.println("c1:"+c1+",c2:"+c2+",c3:"+c3+",c4:"+c4);
		//char���͸�ֵ����ʱ�������ascii���������Ӧ���ַ�
		
		//-------------------------------------------
		//������ boolean    -true  -false
		boolean x = true;
		boolean y = false;
		System.out.println(x);
	}
}
