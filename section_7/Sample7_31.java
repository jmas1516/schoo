//��Βl�i���d��`�j
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
		
		System.out.println("(int) x    =  " + x + "�̐�Βl�F" + absolute(x));
		System.out.println("(int) x    = " + y + "�̐�Βl�F" + absolute(y));
		
		System.out.println("(long) x   =  " + x + "�̐�Βl�F" + absolute((long)x));
		System.out.println("(long) x   = " + y + "�̐�Βl�F" + absolute((long)y));
		
		System.out.println("(double) x =  " + x + "�̐�Βl�F" + absolute((double)x));
		System.out.println("(double) x = " + y + "�̐�Βl�F" + absolute((double)y));
		
		System.out.println("(float) x  =  " + x + "�̐�Βl�F" + absolute((float)x));
		System.out.println("(float) x  = " + y + "�̐�Βl�F" + absolute((float)y));
	}
}