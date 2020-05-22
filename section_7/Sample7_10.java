//暗算げーム
import java.util.Scanner;
import java.util.Random;

class Sample7_10{
	static Scanner scan = new Scanner(System.in);
	static Random  rand = new Random();
	
	//--- 続行の確認 ---//
	static boolean confirmRetry(){
		int cont;
		do{
			System.out.print("Retry? Yes...1, No...0 : ");
			cont = scan.nextInt();
		}while (cont != 1 && cont != 0);
		return cont == 1;
	}
	
	//--- a以上b以下の乱数(a <= b の時は0以上a以下の乱数)
	static int random(int a, int b){
		int random = 0; 
		if(a <= b)  random = rand.nextInt(b - a + 1) + a;
		if(a > b)   random = rand.nextInt(a + 1);
		return random;
	}
	
	public static void main(String[] args){
		System.out.println("暗算ゲーム");
		
		
		int mode;
		do{
			//モード設定
			do{
				System.out.print("Level easy...0, normal...1, hard...2, expert...3 : ");
				mode = scan.nextInt();
			}while(mode < 0 && mode > 3);
			
			//変数決定
			int digit = 1;
			for(int i = 1; i <= mode; i++){
				digit *= 10;
			}
			
			int x = random(digit,(digit * 10 -1));
			int y = random(digit,(digit * 10 -1));
			int z = random(digit,(digit * 10 -1));
			
			int p = random(0, 3);
			
			//問題作成
			int ans = 0;
			int k   = 1;
			while(ans != k){
				switch(p){
					case 0 : System.out.print(x + " + " + y + " + " + z + " = ");
					         ans = x + y + z;
					         k   = scan.nextInt();
					         break;
					case 1 : System.out.print(x + " + " + y + " - " + z + " = ");
					         ans =x + y - z;
					         k   = scan.nextInt();
					         break;
					case 2 : System.out.print(x + " - " + y + " + " + z + " = ");
					         ans = x - y + z;
					         k   = scan.nextInt();
					         break;
					case 3 : System.out.print(x + " - " + y + " - " + z + " = ");
					         ans = x - y - z;
					         k   = scan.nextInt();
					         break;
				}
			}
		}while(confirmRetry());
	}
}