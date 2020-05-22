//—j“ú‚Ì‰pŒê

import java.util.Scanner;
import java.util.Random;

class Sample6_15{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		String[] week   = {"sunday", "monday", "tuesday", "ednesday", "thursday", "friday", "saturday"};
		String[] weekJp = {"“ú", "Œ", "‰Î", "…", "–Ø", "‹à", "“y"};
		
		int    x = -1    ; //˜A‘±”»’è, “ü—Í•¶š—ñ
		int    n         ; //ƒ‰ƒ“ƒ_ƒ€0~6
		String y = ""    ; //“ü—Í
		int    retry = 0 ; //retry”»’è
		
		System.out.println("‰pŒê‚Ì—j“ú–¼‚ğ¬•¶š‚Å“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		do{
			n = rand.nextInt(7);
			if(n == x) continue;
			x = n;
			
			System.out.print(weekJp[n] + "—j“ú:");
			y = scan.next();
			
			if(y.equals(week[n])) System.out.println("Excellemt!!");
			else             System.out.println("The correct answer is " + week[n]);
			
			System.out.print("Retry? Yes...1, No...0 : ");
			retry = scan.nextInt();
			
		}while(retry == 1);
	}
}