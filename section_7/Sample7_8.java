//—””ÍˆÍw’è
import java.util.Scanner;
import java.util.Random;

class Sample7_8{
	
	//--- aˆÈãbˆÈ‰º‚Ì—”‚ğ¶¬(b >= a‚È‚ça‚ğo—Í) ---//
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
		
		System.out.println("aˆÈãbˆÈ‰º‚Ì—”‚ğ¶¬‚µ‚Ü‚·(a < b)");
		
		int a, b;
		do{
			System.out.println("a < b‚Å’l‚ğ“ü—Í");
			System.out.print("a : "); a = scan.nextInt();
			System.out.print("b : "); b = scan.nextInt();
		}while(a >= b);
		
		System.out.println("¶¬‚µ‚½—”");
		for(int i = 0; i < 10; i++){
			System.out.println(random(a,b));
		}
	}
}