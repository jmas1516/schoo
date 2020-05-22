//絶対値（多重定義）
class Sample7_31{
	static int absolute(int x){
		return x >= 0 ? x : -x;
	}
	
	static long absolute(long x){
		return x >= 0 ? x : -x;
	}
	
	static double absolute(double x){
		return x >= 0 ? x : -x;
	}
	
	static float absolute(float x){
		return x >= 0 ? x : -x;
	}
	
	public static void main(String[] args){
		int x = 100;
		int y = -100;
		
		System.out.println("(int) x    =  " + x + "の絶対値：" + absolute(x));
		System.out.println("(int) x    = " + y + "の絶対値：" + absolute(y));
		
		System.out.println("(long) x   =  " + x + "の絶対値：" + absolute((long)x));
		System.out.println("(long) x   = " + y + "の絶対値：" + absolute((long)y));
		
		System.out.println("(double) x =  " + x + "の絶対値：" + absolute((double)x));
		System.out.println("(double) x = " + y + "の絶対値：" + absolute((double)y));
		
		System.out.println("(float) x  =  " + x + "の絶対値：" + absolute((float)x));
		System.out.println("(float) x  = " + y + "の絶対値：" + absolute((float)y));
	}
}