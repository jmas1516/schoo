//正、負、0判定
import java.util.Random;

class Sample7_1{
	
	//--- 正, 負, 0の判定 ---//
	static int signOf(int n){
		int sign = 0;
		if(n < 0) sign = -1;
		if(n > 0) sign =  1;
		return sign;
	}
	public static void main(String[] args){
		Random rand = new Random();
		
		int a = rand.nextInt(5) - 2;
		System.out.println("a = " + a);
		if(signOf(a) == -1) System.out.println("aは負です");
		if(signOf(a) == 1 ) System.out.println("aは正です");
		if(signOf(a) == 0 ) System.out.println("aは0です");
	}
}