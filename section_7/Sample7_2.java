//最小値
import java.util.Random;

class Sample7_2{
	static int min(int a, int b, int c){
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		return min;
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		
		int a = rand.nextInt(101) - 50;
		int b = rand.nextInt(101) - 50;
		int c = rand.nextInt(101) - 50;
		
		System.out.println("変数a, b, cに-50以上50以下をランダムに代入");
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + " 最小値は" + min(a, b, c));
	}
}