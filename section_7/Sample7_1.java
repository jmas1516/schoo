//³A•‰A0”»’è
import java.util.Random;

class Sample7_1{
	
	//--- ³, •‰, 0‚Ì”»’è ---//
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
		if(signOf(a) == -1) System.out.println("a‚Í•‰‚Å‚·");
		if(signOf(a) == 1 ) System.out.println("a‚Í³‚Å‚·");
		if(signOf(a) == 0 ) System.out.println("a‚Í0‚Å‚·");
	}
}