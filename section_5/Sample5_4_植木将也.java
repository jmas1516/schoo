//‚R•Ï”‚Ì•½‹Ï
import java.util.Scanner;

class Sample5_4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("®”x:"); int x = scan.nextInt();
		System.out.print("®”y:"); int y = scan.nextInt();
		System.out.print("®”z:"); int z = scan.nextInt();
		
		double ave = (x + y + z) / 3.0;
		
		System.out.println("•½‹ÏF" + ave);
	}
}