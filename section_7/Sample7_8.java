//乱数範囲指定
import java.util.Scanner;
import java.util.Random;

class Sample7_8{
	
	//--- a以上b以下の乱数を生成(b >= aならaを出力) ---//
	static int random(int a, int b){
		Random rand = new Random();
		
		int random;
		
		if(b <= a) random = a;
		else random = rand.nextInt(b - a + 1) + a;
		
		return random;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("a以上b以下の乱数を生成します(a < b)");
		
		int a, b;
		do{
			System.out.println("a < bで値を入力");
			System.out.print("a : "); a = scan.nextInt();
			System.out.print("b : "); b = scan.nextInt();
		}while(a >= b);
		
		System.out.println("生成した乱数");
		for(int i = 0; i < 10; i++){
			System.out.println(random(a,b));
		}
	}
}