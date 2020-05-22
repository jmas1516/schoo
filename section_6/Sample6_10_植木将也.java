//—”“ü—Í
import java.util.Scanner;
import java.util.Random;
class Sample6_10{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		
		System.out.print("—v‘f”F"); final int n = scan.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			do{
				a[i] = 1 + rand.nextInt(10);
			}while(i > 0 && a[i-1] == a[i]);
			
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}