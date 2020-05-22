//key‚ğŒã‚ë‚©‚ç’Tõ
import java.util.Scanner;
import java.util.Random;

class Sample7_17{
	//--- ”z—ña‚Ì—v‘f‚ªkey‚Å‚ ‚é—v‘f”Ô†‚ğ’Tõ(Œã‚ë‚©‚ç) ---//
	static int searchB(int[] a, int key){
		for(int i = (a.length - 1); i >= 0; i--)
			if(a[i] == key) return i;
		return -1;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("”z—ñ”F"); int n = scan.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++){
			a[i] = rand.nextInt(11) - 6;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		System.out.print("’T‚·’lF"); int key = scan.nextInt();
		int idx = searchB(a, key);
		if(idx == -1)
			System.out.println("‚»‚Ì’l‚Í‘¶İ‚µ‚Ü‚¹‚ñ");
		else
			System.out.println("‚»‚Ì’l‚Ía[" + idx + "]‚É‚ ‚è‚Ü‚·");
	}
}
